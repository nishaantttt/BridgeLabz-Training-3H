import java.util.Scanner;

public class ShortestLongestWordsFinder {
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
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static int[] findShortestAndLongest(String[][] wordsLen) {
        int minLen = Integer.parseInt(wordsLen[0][1]);
        int maxLen = Integer.parseInt(wordsLen[0][1]);
        int minIdx = 0, maxIdx = 0;
        for (int i = 1; i < wordsLen.length; i++) {
            int len = Integer.parseInt(wordsLen[i][1]);
            if (len < minLen) {
                minLen = len;
                minIdx = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIdx = i;
            }
        }
        return new int[]{minIdx, maxIdx};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String input = sc.nextLine();
        String[] words = splitStringWithoutSplit(input);
        String[][] wordsLen = wordsWithLengths(words);
        int[] shortestLongestIndexes = findShortestAndLongest(wordsLen);
        System.out.println("Shortest word: " + wordsLen[shortestLongestIndexes[0]] + " Length: " + wordsLen[shortestLongestIndexes[0]]);
        System.out.println("Longest word: " + wordsLen[shortestLongestIndexes[1]] + " Length: " + wordsLen[shortestLongestIndexes[1]]);
        sc.close();
    }
}
