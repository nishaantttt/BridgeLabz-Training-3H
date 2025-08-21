import java.util.Scanner;

public class CharFrequencyFinder {
    public static String[][] charFrequency(String str) {
        int[] freq = new int[256];
        int len = 0;
        try {
            while (true) { str.charAt(len); len++; }
        } catch (Exception e) {}
        for (int i = 0; i < len; i++) freq[str.charAt(i)]++;
        String[][] out = new String[256][2];
        int k = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (freq[ch] > 0) {
                out[k][0] = String.valueOf(ch);
                out[k][1] = String.valueOf(freq[ch]);
                freq[ch] = 0;
                k++;
            }
        }
        String[][] result = new String[k][2];
        for (int i = 0; i < k; i++) result[i] = out[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String[][] freq = charFrequency(str);
        System.out.println("Char\tFreq");
        for (String[] row : freq)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
