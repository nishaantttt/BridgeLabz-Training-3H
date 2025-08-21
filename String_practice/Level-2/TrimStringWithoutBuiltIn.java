import java.util.Scanner;

public class TrimStringWithoutBuiltIn {
    public static int[] findStartEndIndex(String str) {
        int start = 0, end = str.length() - 1; // Will override length with logic below to avoid built-in
        int length = 0;
        try {
            while(true) {
                str.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {}
        start = 0;
        while (start < length && str.charAt(start) == ' ') start++;
        end = length - 1;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    public static String substringWithoutBuiltIn(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static boolean compareStringsWithoutBuiltIn(String s1, String s2) {
        int len1 = 0, len2 = 0;
        try {
            while(true) {
                s1.charAt(len1);
                len1++;
            }
        } catch (IndexOutOfBoundsException e) {}
        try {
            while(true) {
                s2.charAt(len2);
                len2++;
            }
        } catch (IndexOutOfBoundsException e) {}
        if (len1 != len2) return false;
        for (int i = 0; i < len1; i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with spaces: ");
        String input = sc.nextLine();
        int[] indices = findStartEndIndex(input);
        String trimmedCustom = "";
        if (indices[0] <= indices[1]) {
            trimmedCustom = substringWithoutBuiltIn(input, indices[0], indices[1]);
        }
        String trimmedBuiltIn = input.trim();
        System.out.println("Custom trimmed string: '" + trimmedCustom + "'");
        System.out.println("Built-in trimmed string: '" + trimmedBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + compareStringsWithoutBuiltIn(trimmedCustom, trimmedBuiltIn));
        sc.close();
    }
}
