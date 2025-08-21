import java.util.Arrays;
import java.util.Scanner;

public class StringSplitAndCompare {
    public static int findLength(String str) {
        int count = 0;
        try {
            while(true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    public static String[] splitStringWithoutSplit(String text) {
        int wordCount = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount - 1; i++) {
            words[i] = text.substring(start, spaceIndexes[i]);
            start = spaceIndexes[i] + 1;
        }
        words[wordCount - 1] = text.substring(start, findLength(text));
        return words;
    }
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        String[] customSplit = splitStringWithoutSplit(input);
        String[] builtInSplit = input.split(" ");
        System.out.println("Custom split result: " + Arrays.toString(customSplit));
        System.out.println("Built-in split result: " + Arrays.toString(builtInSplit));
        boolean areEqual = compareStringArrays(customSplit, builtInSplit);
        System.out.println("Are the two arrays equal? " + areEqual);
        sc.close();
    }
}
