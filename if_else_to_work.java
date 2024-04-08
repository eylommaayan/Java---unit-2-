// תוכנית שבודקת אם המועמד מתאים לדרישות העבודה

import java.util.Scanner;

public class if_else_to_work {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Enter your years of experience:");
        int experience = scanner.nextInt();

        if (age >= 35 && age <= 45 && experience > 3) {
            System.out.println("You are suitable for the job.");
        } else {
            System.out.println("You are not suitable for the job.");
        }

        // Don't forget to close the scanner
        scanner.close();
    }
}
