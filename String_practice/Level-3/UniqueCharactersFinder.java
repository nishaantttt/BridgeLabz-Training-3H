import java.util.Scanner;

public class UniqueCharactersFinder {
    public static int stringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static char[] uniqueChars(String str) {
        int len = stringLength(str);
        char[] uniq = new char[len];
        int uniqCount = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniq[uniqCount++] = ch;
            }
        }
        char[] result = new char[uniqCount];
        for (int i = 0; i < uniqCount; i++) result[i] = uniq[i];
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        char[] unique = uniqueChars(str);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        System.out.println();
    }
}
