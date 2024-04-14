// תוכנית המקבלת כקלט את המספר החבילות השוקלוד שקנה ואת מספר חבילות השוקולד שמכר. על התוכנית להציג הודעה האם הסוחר הרוויח או הפסיד מהעסקה
import java.util.Scanner;

public class If_Profit_Or_Loss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of chocolate packs bought:");
        int packsBought = scanner.nextInt();

        System.out.println("Enter the number of chocolate packs sold:");
        int packsSold = scanner.nextInt();

        // Calculate the total cost and total revenue
        int totalCost = packsBought * 5; // Cost per pack is 5
        int totalRevenue = packsSold * 10; // Revenue per pack is 10

        // Check if there is a profit, loss, or break-even
        if (totalRevenue > totalCost) {
            int profit = totalRevenue - totalCost;
            System.out.println("The trader made a profit of $" + profit);
        } else if (totalRevenue < totalCost) {
            int loss = totalCost - totalRevenue;
            System.out.println("The trader incurred a loss of $" + loss);
        } else {
            System.out.println("The trader broke even.");
        }

        scanner.close();
    }
}
