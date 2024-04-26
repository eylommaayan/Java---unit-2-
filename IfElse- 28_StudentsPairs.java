import java.util.Scanner;

public class StudentsPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // קליטת מספר התלמידים בכיתה
        System.out.println("הזן את מספר התלמידים בכיתה:");
        int numStudents = scanner.nextInt();

        // בדיקה האם מספר התלמידים יכול להיות מספר המושלם של זוגות, שלשולות וריבעיות
        if (isPerfectPair(numStudents) || isPerfectTriple(numStudents) || isPerfectQuartet(numStudents)) {
            System.out.println("כן, מספר התלמידים יכול להיות מספר המושלם של זוגות, שלשולות או ריבעיות.");
        } else {
            System.out.println("לא, מספר התלמידים אינו יכול להיות מספר המושלם של זוגות, שלשולות או ריבעיות.");
        }
    }

    // בדיקה האם המספר הוא מספר המושלם של זוגות
    private static boolean isPerfectPair(int num) {
        return num % 2 == 0;
    }

    // בדיקה האם המספר הוא מספר המושלם של שלשולות
    private static boolean isPerfectTriple(int num) {
        return num % 3 == 0;
    }

    // בדיקה האם המספר הוא מספר המושלם של ריבעיות
    private static boolean isPerfectQuartet(int num) {
        return num % 4 == 0;
    }
}
