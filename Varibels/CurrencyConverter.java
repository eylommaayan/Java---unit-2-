package Varibels;
import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת המחיר בדולר מהמשתמש
        System.out.println("נא הזן את המחיר בדולר:");
        double priceInDollars = scanner.nextDouble();

        // מחשבת המחיר בשקלים (לפי קצב ההמרה הנוכחי, נניח כעת 3.3 ש"ח לדולר)
        double priceInShekels = priceInDollars * 3.3;

        // הדפסת המחיר בשקלים
        System.out.println("המחיר בשקלים הוא: " + priceInShekels + " שקלים");

        scanner.close();
    }
}
