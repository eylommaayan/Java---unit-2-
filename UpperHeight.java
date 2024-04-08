//שבודקת איזה גובה יותר גבוה ואם לא נסיגה if תוכנית תנאי 

import java.util.Scanner;

public class UpperHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the heights
        System.out.println("הכנס מספר: ");
        int height1 = scanner.nextInt();

        System.out.println("הכנס מספר ");
        int height2 = scanner.nextInt();

        // Compare the heights and print the result
        if (height1 > height2) {
            System.out.println(height1 + " גבוהה יותר.");
        } else if (height2 > height1) {
            System.out.println(height2 + " גבוהה יותר.");
        } else {
            System.out.println("נסיגה בגובה.");
        }

        // Close the scanner
        scanner.close();
    }
}
