import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome1(String str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static boolean isPalindrome2(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindrome2(str, start + 1, end - 1);
    }
    public static boolean isPalindrome3(String str) {
        char[] arr = str.toCharArray();
        char[] rev = new char[arr.length];
        int n = arr.length - 1;
        for (int i = 0; i < arr.length; i++) rev[i] = str.charAt(n - i);
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();
        System.out.println("Logic 1: " + (isPalindrome1(str) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 2: " + (isPalindrome2(str, 0, str.length() - 1) ? "Palindrome" : "Not Palindrome"));
        System.out.println("Logic 3: " + (isPalindrome3(str) ? "Palindrome" : "Not Palindrome"));
    }
}
