import java.util.Scanner;

public class calculateNumberOfBoxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of oranges: ");
        int oranges = scanner.nextInt();
        System.out.print("Enter the number of pomelos: ");
        int pomelos = scanner.nextInt();
        System.out.print("Enter the number of grapes: ");
        int grapes = scanner.nextInt();
        
        int numOfBoxes = calculateNumberOfBoxes(oranges, pomelos, grapes);
        
        System.out.println("Number of full boxes: " + numOfBoxes);
    }
    
    public static int calculateNumberOfBoxes(int oranges, int pomelos, int grapes) {
        // Calculate the number of boxes needed for each type of fruit
        int orangeBoxes = oranges / 20;
        int pomeloBoxes = pomelos / 4;
        int grapeBoxes = grapes / 12;
        
        // Find the minimum number of boxes needed
        int minBoxes = Math.min(orangeBoxes, Math.min(pomeloBoxes, grapeBoxes));
        
        return minBoxes;
    }
}
