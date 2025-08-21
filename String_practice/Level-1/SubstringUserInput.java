package String_practice;

import java.util.Scanner;

public class SubstringUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take string input from user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        // Take start and end index from user
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Check valid indices
        if (start < 0 || end > text.length() || start >= end) {
            System.out.println("Invalid indices! Please enter valid start and end.");
        } else {
            // 1. Build substring manually using charAt()
            StringBuilder manualSubstring = new StringBuilder();
            for (int i = start; i < end; i++) {
                manualSubstring.append(text.charAt(i));
            }

            // 2. Built-in substring
            String builtinSubstring = text.substring(start, end);

            // 3. Compare
            System.out.println("\nOriginal String: " + text);
            System.out.println("Manual substring (charAt): " + manualSubstring.toString());
            System.out.println("Built-in substring: " + builtinSubstring);
            System.out.println("Are both substrings equal? " +
                               manualSubstring.toString().equals(builtinSubstring));
        }
    }
}
