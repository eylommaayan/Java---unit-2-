// תוכנית שבודקת אם המספר שהכונס הוא יחיד או לא 

import java.util.Scanner;

public class IfElse_SingleOrDigitNumber {
    
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter any  number:");
        int number = scanner.nextInt();

        if (number > 9 ) {
            System.out.println("This is digit number");
        }
        else {
            System.out.println("This is singl number");
        }
    }

}