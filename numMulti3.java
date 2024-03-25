// כתוב תכנית המקבלת מספר שלם ומדפיס בשורות נפרדות:
// את נתון הקלט, מספר גדול ב-3 ממספר הקלט, מספר הגדול פי 4 ממספר הקלט


import java.util.Scanner;

public class numMulti3 {
    public static void main(String[] args) {
        // יצירת מופע של מחלקת Scanner לקריאת קלט מהמשתמש
        Scanner scanner = new Scanner(System.in);

        // הדפסת הודעה למשתמש להזנת מספר שלם
        System.out.print("נא הכנס מספר שלם: ");

        // קריאת המספר השלם מהמשתמש
        int num = scanner.nextInt();

        // הדפסת המספר השלם שהוזן על ידי המשתמש
        System.out.println("המספר שהוזן הוא: " + num);

        // מספר גדול ב-3 מהמספר שהוזן על ידי המשתמש
        int bigBy3 = num + 3;
        System.out.println("מספר גדול ב-3 מהמספר שהוזן הוא: " + bigBy3);

        // מספר גדול פי 4 מהמספר שהוזן על ידי המשתמש
        int bigTimes4 = num * 4;
        System.out.println("מספר הגדול פי 4 מהמספר שהוזן הוא: " + bigTimes4);

        // סגירת הסורק
        scanner.close();
    }
}
