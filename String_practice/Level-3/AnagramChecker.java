import java.util.Scanner;

public class AnagramChecker {
    public static boolean isAnagram(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 != len2) return false;
        int[] freq1 = new int[256], freq2 = new int[256];
        for (int i = 0; i < len1; i++) freq1[s1.charAt(i)]++;
        for (int i = 0; i < len2; i++) freq2[s2.charAt(i)]++;
        for (int i = 0; i < 256; i++) if (freq1[i] != freq2[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first text: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second text: ");
        String s2 = sc.nextLine();
        System.out.println(isAnagram(s1, s2) ? "Anagrams" : "Not Anagrams");
    }
}
