package While;
public class WhileLoopExamples {

    public static void main(String[] args) {
        // Example 1: Roll a dice until a 6 is rolled
        // TODO: כתוב לולאת while המדמה הטלת קובייה עד להטלת 6

        // Example 2: Generate random numbers between 1 and 100 until a number greater than 90 is generated
        // TODO: כתוב לולאת while שיוצרת מספרים אקראיים בין 1 ל-100 עד שנוצר מספר גדול מ-90


        // Example 3: Keep doubling a random number until it's greater than 1000
        // TODO: כתוב לולאת while שממשיכה להכפיל את המשתנה 'מספר' עד שהוא גדול מ-1000
    }

    // Function to simulate rolling a dice (returns a random integer between 1 and 6)
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    // Function to generate a random integer between 1 and 100
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
