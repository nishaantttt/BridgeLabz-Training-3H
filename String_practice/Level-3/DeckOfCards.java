import java.util.Random;
import java.util.Scanner;

public class DeckOfCards {
    static String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int k = 0;
        for (String suit : suits) for (String rank : ranks) deck[k++] = rank + " of " + suit;
        return deck;
    }
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int r = i + rand.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }
    public static String[][] distributeCards(String[] deck, int nPlayers, int nCards) {
        if (nPlayers * nCards > deck.length) {
            System.out.println("Not enough cards.");
            return null;
        }
        String[][] players = new String[nPlayers][nCards];
        int d = 0;
        for (int i = 0; i < nPlayers; i++)
            for (int j = 0; j < nCards; j++)
                players[i][j] = deck[d++];
        return players;
    }
    public static void displayPlayers(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i+1) + ": ");
            for (String card : players[i]) System.out.print(card + ", ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int nPlayers = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int nCards = sc.nextInt();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, nPlayers, nCards);
        displayPlayers(players);
    }
}
