/**
 * 
 * בשכת יוד 3 כיתות
כתוב תוכנית המקבלת כקלט את מספר התלמידים בכל כיתה ומחזירה כפלט את מספר האוטובוסים שיש להזמין עבור השכבה.
הנח כי מספר הנוסעים המקסימלי לאוטובוס הוא 40
 */

import java.util.Scanner;

public class if_BusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting the number of students in each class
        System.out.print("Enter the number of students in class 1: ");
        int class1Students = scanner.nextInt();
        System.out.print("Enter the number of students in class 2: ");
        int class2Students = scanner.nextInt();
        System.out.print("Enter the number of students in class 3: ");
        int class3Students = scanner.nextInt();
        
        // Calculate the number of buses needed for each class
        int class1Buses = (int) Math.ceil((double) class1Students / 40);
        int class2Buses = (int) Math.ceil((double) class2Students / 40);
        int class3Buses = (int) Math.ceil((double) class3Students / 40);
        
        // Calculate the total number of buses needed
        int totalBuses = class1Buses + class2Buses + class3Buses;
        
        // Output the result
        System.out.println("The number of buses needed for class 1: " + class1Buses);
        System.out.println("The number of buses needed for class 2: " + class2Buses);
        System.out.println("The number of buses needed for class 3: " + class3Buses);
        System.out.println("Total number of buses needed: " + totalBuses);
        
        scanner.close();
    }
}


/**
 * תוכנית זו מבצעת את השלבים הבאים:

מקבלת את מספר התלמידים בכל כיתה מהמשתמש.
סוכמת את כמות התלמידים בכל הכיתות.
מחשבת את מספר האוטובוסים הנדרשים על פי מספר התלמידים והמקסימום של 40 תלמידים באוטובוס, ומחזירה את התוצאה.
User
 הסבר את הפקודה
 int busesNeeded = (int) Math.ceil((double) totalStudents / 40);
ChatGPT
הפקודה הזו מחשבת את מספר האוטובוסים הנדרשים על פי מספר התלמידים והמקסימום של 40 תלמידים באוטובוס. נביא את ההסבר לכל חלק בפקודה:

(double) totalStudents: כאן אנו משתמשים בהמרה סוגית מספר הסטודנטים (המספר הסטנדרטי, שבדרך כלל הוא int) לסוג double. ההמרה ל-double מאפשרת לנו לבצע חלוקה מדויקת יותר.
Math.ceil(...): משתמשים בפונקציה ceil מהמחלקה Math שב-Java. פונקציה זו מקבלת כארגומנט מספר עשרוני (double) ומחזירה את המספר השלם הקטן ביותר שהוא גדול או שווה לערך שהתקבל. במילים אחרות, היא מעגלת למספר השלם הקרוב הגדול יותר.
/ 40: מחלקים את תוצאת ההמרה ל-double של מספר התלמידים ב-40. זה מחזיר את מספר האוטובוסים המשוער בהתאם למספר התלמידים בכיתות, על פי כמות התלמידים שניתן להכניס לאוטובוס אחד (40).
(int): לבסוף, יש כאן המרה חזרה לסוג int מסוג ה-double שקיבלנו כתוצאה. זה נכון מכיוון שמספר האוטובוסים חייב להיות מספר שלם (ולא double). על כן אנו משתמשים בהמרה ל-int כדי לקבל את התוצאה השלמה המשוערת.
User

 */