import java.util.Scanner;

public class IfElse_AreaCircumferenceOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for width and height
        System.out.println("Enter the width and height of the square:");
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        
        // Calculate area and perimeter
        int area = width * height;
        int perimeter = 2 * (width + height);
        
        // Check if it's a square and calculate area
        if (width == height) {
            System.out.println("It's a square.");
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        } else {
            System.out.println("It's not a square.");
            System.out.println("Area: " + area);
        }
        
        scanner.close();
    }
}
