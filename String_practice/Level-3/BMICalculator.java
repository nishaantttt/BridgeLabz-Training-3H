import java.util.Scanner;

public class BMICalculator {
    public static double[][] readHeightWeight(int n) {
        Scanner sc = new Scanner(System.in);
        double[][] hw = new double[n][2];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            hw[i][0] = sc.nextDouble();
            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            hw[i][1] = sc.nextDouble();
        }
        return hw;
    }
    public static String[][] computeBMI(double[][] hw) {
        int n = hw.length;
        String[][] result = new String[n][4];
        for (int i = 0; i < n; i++) {
            double weight = hw[i][0];
            double heightMeters = hw[i][1] / 100.0;
            double bmi = weight / (heightMeters * heightMeters);
            String status = "";
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";
            result[i][0] = String.format("%.1f", hw[i][1]);
            result[i][1] = String.format("%.1f", hw[i]);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }
    public static void displayBMI(String[][] arr) {
        System.out.printf("%-10s%-10s%-10s%-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : arr) {
            System.out.printf("%-10s%-10s%-10s%-15s\n", row[0], row[1], row[2], row);
        }
    }
    public static void main(String[] args) {
        int n = 10;
        double[][] hw = readHeightWeight(n);
        String[][] results = computeBMI(hw);
        displayBMI(results);
    }
}
