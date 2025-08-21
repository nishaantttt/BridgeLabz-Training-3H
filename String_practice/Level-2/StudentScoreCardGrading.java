import java.util.Random;

public class StudentScoreCardGrading {

    // Method to generate random 2-digit scores for n students in PCM
    public static int[][] generateRandomScores(int n) {
        Random rand = new Random();
        int[][] scores = new int[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = rand.nextInt(90) + 10; // Physics
            scores[i][1] = rand.nextInt(90) + 10; // Chemistry
            scores[i][2] = rand.nextInt(90) + 10; // Maths
        }
        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScoreStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; // total, average, percentage
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 3.0);
            stats[i][0] = total;
            stats[i][1] = Math.round(average * 100.0) / 100.0;
            stats[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return stats;
    }

    // Method to calculate grade based on percentage as per table in image
    public static String[] calculateGrades(double[][] stats) {
        int n = stats.length;
        String[] grades = new String[n];
        for (int i = 0; i < n; i++) {
            double pct = stats[i][2];
            if (pct >= 80) grades[i] = "A";
            else if (pct >= 70) grades[i] = "B";
            else if (pct >= 60) grades[i] = "C";
            else if (pct >= 50) grades[i] = "D";
            else if (pct >= 40) grades[i] = "E";
            else grades[i] = "R";
        }
        return grades;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.printf("%-8s%-10s%-12s%-8s%-8s%-12s%-12s%-10s\n",
                "Student", "Physics", "Chemistry", "Maths", "Total", "Average", "Percent", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-8d%-10d%-12d%-8d%-8.0f%-12.2f%-12.2f%-10s\n",
                    (i+1), scores[i][0], scores[i][1], scores[i],
                    stats[i], stats[i][1], stats[i], grades[i]);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of students
        int[][] scores = generateRandomScores(n);
        double[][] stats = calculateScoreStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
