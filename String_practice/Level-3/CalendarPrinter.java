import java.util.Scanner;

public class CalendarPrinter {
    static String[] monthNames = { "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December" };
    static int[] monthDays = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static boolean isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int daysInMonth(int m, int y) {
        if (m == 2 && isLeap(y)) return 29;
        return monthDays[m];
    }
    public static int firstDay(int month, int year) {
        int d = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month)/12) - 2;
        return (d + x + (31*m0)/12) % 7;
    }
    public static void printCalendar(int m, int y) {
        System.out.printf("\n   %s %d\n", monthNames[m], y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int start = firstDay(m, y);
        int days = daysInMonth(m, y);
        for (int i = 0; i < start; i++) System.out.print("    ");
        for (int d = 1; d <= days; d++) {
            System.out.printf("%3d ", d);
            if ((d + start) % 7 == 0) System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();
        printCalendar(month, year);
    }
}
