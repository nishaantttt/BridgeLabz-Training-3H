import java.util.Scanner;

public class CharFrequencyNested {
    public static String[][] freqNested(String str) {
        char[] arr = str.toCharArray();
        int len = arr.length;
        int[] freq = new int[len];
        for (int i = 0; i < len; i++) {
            freq[i] = 1;
        }
        for (int i = 0; i < len; i++) {
            if (arr[i] == '0') continue;
            for (int j = i + 1; j < len; j++) {
                if (arr[i] == arr[j]) {
                    freq[i]++;
                    arr[j] = '0';
                }
            }
        }
        int k = 0;
        String[][] res = new String[len][2];
        for (int i = 0; i < len; i++) {
            if (arr[i] != '0') {
                res[k][0] = String.valueOf(arr[i]);
                res[k][1] = String.valueOf(freq[i]);
                k++;
            }
        }
        String[][] result = new String[k][2];
        for (int i = 0; i < k; i++) result[i] = res[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String[][] freq = freqNested(str);
        System.out.println("Char\tFreq");
        for (String[] row : freq)
            System.out.println(row[0] + "\t" + row[1]);
    }
}
