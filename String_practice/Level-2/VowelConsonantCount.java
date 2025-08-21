import java.util.Scanner;

public class VowelConsonantCount {
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32); // Convert uppercase to lowercase ASCII
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        int len = 0;
        try {
            while(true) {
                str.charAt(len);
                len++;
            }
        } catch (IndexOutOfBoundsException e) {}
        for (int i = 0; i < len; i++) {
            String type = charType(str.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }
        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] counts = countVowelsConsonants(input);
        System.out.println("Vowels: " + counts[0] + " Consonants: " + counts);
        sc.close();
    }
}
