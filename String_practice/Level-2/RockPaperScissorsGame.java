import java.util.Scanner;

public class RockPaperScissorsGame {
    public static String getComputerChoice() {
        double rand = Math.random();
        if (rand < 1.0 / 3) return "rock";
        else if (rand < 2.0 / 3) return "paper";
        else return "scissors";
    }
    public static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if (user.equals("rock")) {
            return comp.equals("scissors") ? "User" : "Computer";
        } else if (user.equals("paper")) {
            return comp.equals("rock") ? "User" : "Computer";
        } else if (user.equals("scissors")) {
            return comp.equals("paper") ? "User" : "Computer";
        }
        return "Invalid";
    }
    public static String[][] statsTable(int totalGames, int userWins, int compWins) {
        String[][] stats = new String[2][3];
        stats[0][0] = "Player";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = totalGames == 0 ? "0.00%" : String.format("%.2f%%", (userWins * 100.0) / totalGames);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = totalGames == 0 ? "0.00%" : String.format("%.2f%%", (compWins * 100.0) / totalGames);
        return stats;
    }
    public static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWin %");
        for (String[] row : stats) {
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games to play: ");
        int n = sc.nextInt();
        String[][] gameResults = new String[n][3];
        int userWins = 0, compWins = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter user choice (rock/paper/scissors): ");
            String userChoice = sc.next().toLowerCase();
            String compChoice = getComputerChoice();
            String winner = findWinner(userChoice, compChoice);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
            gameResults[i][0] = userChoice;
            gameResults[i][1] = compChoice;
            gameResults[i][2] = winner;
        }
        String[][] stats = statsTable(n, userWins, compWins);
        displayResults(gameResults, stats);
        sc.close();
    }
}
