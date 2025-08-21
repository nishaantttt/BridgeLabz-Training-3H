import java.util.Scanner;

public class VowelConsonantCharType {
    public static String charType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // uppercase to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] vowelsConsonantsWithCharType(String str) {
        int length = 0;
        try {
            while(true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        String[][] result = new String[length][2];
        for (int i = 0; i < length; i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = charType(str.charAt(i));
        }
        return result;
    }
    public static void displayTable(String[][] arr) {
        System.out.println("Char\tType");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t" + row);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] results = vowelsConsonantsWithCharType(input);
        displayTable(results);
        sc.close();
    }
}
