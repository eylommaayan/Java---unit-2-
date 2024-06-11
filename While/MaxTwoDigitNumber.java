/**
 * כתוב תוכנית ב-java
המקבלת כקלט מספרים דו-ספריים ומציגה את המספר הדו-ספרתי הגדול ביותר שספרותיו שונות זו מזו.
 בחר זקיף כרצונך. בתוכנית רשום מעל כל שורת קוד הערה מה היא עושה
 */

 import java.util.Scanner;

 public class MaxTwoDigitNumber {
     public static void main(String[] args) {
         // Create a Scanner object to read input from the user
         Scanner scanner = new Scanner(System.in);
         
         // Prompt the user to enter two-digit numbers
         System.out.println("Enter two-digit numbers (press Enter after each number, type 'done' to finish):");
 
         int maxTwoDigitNumber = -1; // Initialize the maximum two-digit number found
         
         // Keep reading input until the user types 'done'
         while (true) {
             String input = scanner.nextLine(); // Read the next input line
             
             // Check if the user typed 'done' to finish entering numbers
             if (input.equals("done")) {
                 break; // Exit the loop
             }
             
             // Parse the input as an integer
             int number = Integer.parseInt(input);
             
             // Check if the number is a two-digit number
             if (number >= 10 && number <= 99) {
                 // Extract the digits of the number
                 int tensDigit = number / 10;
                 int onesDigit = number % 10;
                 
                 // Check if the digits are different
                 if (tensDigit != onesDigit) {
                     // Update the maximum two-digit number if the current number is greater
                     maxTwoDigitNumber = Math.max(maxTwoDigitNumber, number);
                 }
             }
         }
         
         // Display the maximum two-digit number found
         if (maxTwoDigitNumber != -1) {
             System.out.println("The largest two-digit number with different digits is: " + maxTwoDigitNumber);
         } else {
             System.out.println("No valid two-digit numbers were entered.");
         }
         
         // Close the scanner to release resources
         scanner.close();
     }
 }
 