package String_practice;

import java.util.Scanner;

public class CharArrayComparison {  

    // User-defined method to get characters without using toCharArray
    public static char[] getChars(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Call user-defined method
        char[] userChars = getChars(text);

        // Call built-in toCharArray()
        char[] builtinChars = text.toCharArray();

        // Compare
        boolean isEqual = compareCharArrays(userChars, builtinChars);

        System.out.println("User-defined char array: " + new String(userChars));
        System.out.println("Built-in char array: " + new String(builtinChars));
        System.out.println("Are both arrays equal? " + isEqual);
    }
}
