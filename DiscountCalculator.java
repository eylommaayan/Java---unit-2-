import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת המחיר ואחוז ההנחה מהמשתמש
        System.out.println("נא הזן את המחיר:");
        double price = scanner.nextDouble();
        System.out.println("נא הזן את אחוז ההנחה:");
        double discountPercentage = scanner.nextDouble();

        // מחשבת המחיר לאחר ההנחה
        double discountedPrice = price * (1 - (discountPercentage / 100));

        // הדפסת המחיר לאחר ההנחה
        System.out.println("המחיר לאחר ההנחה הוא: " + discountedPrice);

        scanner.close();
    }
}
