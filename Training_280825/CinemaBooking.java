package Training_280825;

import java.util.*;

public class CinemaBooking {
    static int ROWS = 5;
    static int COLS = 10;
    static int[][] seats = new int[ROWS][COLS];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initially all seats empty (0)
        for (int i = 0; i < ROWS; i++) {
            Arrays.fill(seats[i], 0);
        }

        // Example: book multiple families
        while (true) {
            System.out.print("Enter family size (or 0 to exit): ");
            int k = sc.nextInt();
            if (k == 0) break;

            if (bookSeats(k)) {
                System.out.println("Seats booked successfully!");
            } else {
                System.out.println("Not available");
            }

            printSeats();
        }
    }

    static boolean bookSeats(int k) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j <= COLS - k; j++) {
                boolean free = true;

                // check k consecutive seats
                for (int x = 0; x < k; x++) {
                    if (seats[i][j + x] == 1) {
                        free = false;
                        break;
                    }
                }

                // if found, book them
                if (free) {
                    for (int x = 0; x < k; x++) {
                        seats[i][j + x] = 1;
                    }
                    return true;
                }
            }
        }
        return false; // no suitable seats found
    }

    static void printSeats() {
        System.out.println("\nCurrent Seating Layout (0=empty, 1=booked):");
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
