package Varibels;

//  הנה תכנית בשפת ג'אווה שמקבלת שלושה תווים ומדפיסה אותם בסדר הקליטה ובסדר הפוך:

import java.util.Scanner;

public class CharactersReverse {
    public static void main(String[] args) {
        // יצירת מופע של מחלקת Scanner לקריאת קלט מהמשתמש
        Scanner scanner = new Scanner(System.in);

        // הדפסת הודעה למשתמש להזנת שלושה תווים
        System.out.print("נא הזן שלושה תווים: ");

        // קריאת התווים מהמשתמש
        String input = scanner.nextLine(); // קריאת כל השורה

        // הדפסת התווים בסדר הקליטה
        System.out.println("התווים בסדר הקליטה: " + input);

        // הדפסת התווים בסדר הפוך לסדר הקליטה
        System.out.println("התווים בסדר הפוך לסדר הקליטה: " + new StringBuilder(input).reverse().toString());

        // סגירת הסורק
        scanner.close();
}
}