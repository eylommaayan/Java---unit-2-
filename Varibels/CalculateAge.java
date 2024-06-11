package Varibels;
// כתוב תכונית בג'אווה שקולטת שני מספרים שלמים שמייצגים את השנה הנוכחית ואת השנה בה נולדת.
//   על התוכנית לחשב ולהציג את גילך

import java.util.Scanner;
import java.util.Calendar;

public class CalculateAge {
    public static void main(String[] args) {
        // יצירת אובייקט לקליטת קלט מהמשתמש
        Scanner scanner = new Scanner(System.in);

        // קבלת שנה נוכחית
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        // קליטת שנת לידה מהמשתמש
        System.out.println("אנא הזן את שנת הלידה שלך:");
        int birthYear = scanner.nextInt();

        // חישוב הגיל
        int age = currentYear - birthYear;

        // הצגת הגיל
        System.out.println("גילך הוא: " + age + " שנים");

        // סגירת הסורק
        scanner.close();
    }
}

