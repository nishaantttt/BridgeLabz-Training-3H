import java.util.Scanner;

public class UppercaseComparison {

    // Convert manually using ASCII values
    public static String toUpperManual(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                sb.append((char)(c - 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // Compare strings character by character
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

}