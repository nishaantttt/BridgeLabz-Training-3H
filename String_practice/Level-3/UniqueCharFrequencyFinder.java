import java.util.Scanner;

public class UniqueCharFrequencyFinder {
    public static char[] uniqueChars(String str) {
        int len = 0;
        try { while (true) { str.charAt(len); len++; } } catch (Exception e) {}
        char[] uniq = new char[len];
        int uniqCount = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) { isUnique = false; break; }
            }
            if (isUnique) uniq[uniqCount++] = ch;
        }
        char[] result = new char[uniqCount];
        for (int i = 0; i < uniqCount; i++) result[i] = uniq[i];
        return result;
    }
    public static int[] charFrequency(String str) {
        int[] freq = new int[256];
        int len = 0;
        try { while (true) { str.charAt(len); len++; } } catch (Exception e) {}
        for (int i = 0; i < len; i++) freq[str.charAt(i)]++;
        return freq;
    }
    public static String[][] freqWithUnique(String str) {
        char[] uniq = uniqueChars(str);
        int[] freq = charFrequency(str);
        String[][] result = new String[uniq.length][2];
        for (int i = 0; i < uniq.length; i++) {
            result[i][0] = String.valueOf(uniq[i]);
            result[i][1] = String.valueOf(freq[uniq[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String[][] result = freqWithUnique(str);
        System.out.println("Char\tFreq");
        for (String[] row : result)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
