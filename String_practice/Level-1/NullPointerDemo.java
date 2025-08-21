package String_practice;

public class NullPointerDemo {

    // Method to generate NullPointerException
    public static void generateNPE() {
        String text = null;
        System.out.println("Length: " + text.length()); // Generates NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleNPE() {
        try {
            String text = null;
            System.out.println("Length: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // First call without handling
        //generateNPE();   // Uncomment to see abrupt termination

        // Now with handling
        handleNPE();
    }
}
