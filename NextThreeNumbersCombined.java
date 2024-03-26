import java.util.Scanner;

public class NextThreeNumbersCombined {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת המספר מהמשתמש
        System.out.println("אנא הזן מספר שלם:");
        int number = scanner.nextInt();

        // הצגת המספרים השלמים העוקבים עם הוראות השמה
        System.out.println("המספרים השלמים העוקבים ל-" + number + " הם:");
        System.out.println((number + 1) + ", " + (number + 2) + ", " + (number + 3));

        // הצגת המספרים השלמים העוקבים באמצעות אופרטורים מקוצרים
        System.out.println("המספרים השלמים העוקבים ל-" + number + " הם:");
        System.out.println((number += 1) + ", " + (number += 1) + ", " + (number + 1));

        scanner.close();
    }
}
