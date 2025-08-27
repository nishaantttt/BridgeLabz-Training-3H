import java.util.Scanner;

public class TrainReservationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Train data
        String[] trains = {"Express A", "Express B", "Superfast C"};
        int[] fares = {500, 800, 1200};
        int[] seats = {5, 5, 5}; // each train has 5 seats

        System.out.println("🚉 Welcome to Railway Reservation System");

        int choice;
        do {
            // show train options
            System.out.println("\nAvailable Trains:");
            for (int i = 0; i < trains.length; i++) {
                System.out.println((i + 1) + ". " + trains[i] + " - ₹" + fares[i] + " | Seats left: " + seats[i]);
            }

            System.out.print("Enter train choice (1-3): ");
            choice = sc.nextInt();

            if (choice >= 1 && choice <= 3) {
                sc.nextLine(); // consume newline
                System.out.print("Enter passenger name: ");
                String name = sc.nextLine();

                System.out.print("How many seats do you want to book? ");
                int numSeats = sc.nextInt();

                // check availability
                if (seats[choice - 1] >= numSeats) {
                    seats[choice - 1] -= numSeats;
                    int totalFare = fares[choice - 1] * numSeats;
                    System.out.println("✅ Booking Confirmed for " + name +
                            " (" + numSeats + " seats) in " + trains[choice - 1]);
                    System.out.println("💰 Total Fare: ₹" + totalFare);
                } else {
                    System.out.println("⚠ Only " + seats[choice - 1] + " seats available in " + trains[choice - 1]);
                    System.out.println("👉 " + name + " added to Waiting List");
                }
            } else {
                System.out.println("Invalid choice");
            }

            System.out.print("\nDo you want to book another ticket? (yes=1 / no=0): ");
        } while (sc.nextInt() == 1);

        sc.close();
        System.out.println("\nThank you for using the Railway Reservation System!");
    }
}
