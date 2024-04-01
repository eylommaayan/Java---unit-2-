import java.util.Scanner;

public class SumAndMultiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת שלושה מספרים מהמשתמש
        System.out.println("נא הזן שלושה מספרים:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // חישוב והדפסת החיבור
        int sum = num1 + num2 + num3;
        System.out.println("החיבור של המספרים הוא: " + sum);

        // חישוב והדפסת הכפל
        int multiply = num1 * num2 * num3;
        System.out.println("הכפל של המספרים הוא: " + multiply);

        scanner.close();
    }
}
