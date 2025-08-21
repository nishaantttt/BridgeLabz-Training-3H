import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void generateException(String text) {
        System.out.println("Char: " + text.charAt(text.length() + 1));
    }

    public static void handleException(String text) {
        try {
            System.out.println("Char: " + text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        //generateException(text);  // Uncomment to see the crash
        handleException(text);
    }
}
