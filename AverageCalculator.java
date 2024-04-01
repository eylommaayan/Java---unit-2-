import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת שלושה ערכים שלמים מהמשתמש
        System.out.println("נא הזן שלושה ערכים שלמים:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // חישוב הממוצע
        double average = (num1 + num2 + num3) / 3.0;

        // הדפסת הממוצע
        System.out.println("הממוצע של הערכים הוא: " + average);

        scanner.close();
    }
}
