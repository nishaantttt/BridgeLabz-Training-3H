public class GradeCalculator {

    public static void main(String[] args) {
        int gradePointTotal =-1 ;
        int creditHours = -1;
        if (gradePointTotal < 0 || creditHours < 0) {
            throw new IllegalArgumentException("Grade points and credit hours cannot be negative.");
        }
        if (creditHours == 0) {
            throw new IllegalArgumentException("Credit hours cannot be zero.");
        }
    }
}