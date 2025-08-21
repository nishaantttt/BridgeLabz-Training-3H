public class StringLengthWithoutLengthMethod {
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
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int lengthFromMethod = findLength(input);
        int lengthFromBuiltin = input.length();
        System.out.println("Length from custom method: " + lengthFromMethod);
        System.out.println("Length from built-in method: " + lengthFromBuiltin);
        sc.close();
    }
}
