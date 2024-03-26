
// כתבו תוכנית הקולטת גובה ובסיס של משלולש שווה צלעות.
//  הפלט יהיה ההיקף והשטח של המשולש


import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת גובה ובסיס של המשולש מהמשתמש
        System.out.print("נא הכנס את גובה המשולש: ");
        double height = scanner.nextDouble();

        System.out.print("נא הכנס את הבסיס של המשולש: ");
        double base = scanner.nextDouble();

        // חישוב השטח של המשולש
        double area = 0.5 * height * base;

        // חישוב ההיקף של המשולש
        // משולש שווה צלעות, כלומר כל צלע שווה לבסיס המשולש
        double perimeter = 3 * base;

        // הדפסת התוצאות
        System.out.println("השטח של המשולש הוא: " + area);
        System.out.println("ההיקף של המשולש הוא: " + perimeter);

        scanner.close();
    }
}
