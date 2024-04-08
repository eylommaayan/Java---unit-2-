import java.util.Scanner;

public class SevenBoomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // הזן את המספר הראשוני של המשתתפים
        System.out.println("Enter the initial number of participants:");
        int initialParticipants = scanner.nextInt();

        // חישוב מספר המשתתפים לאחר הסבב הראשון
        int remainingAfterFirstRound = calculateAfterFirstRound(initialParticipants);
        System.out.println("Number of participants after the first round: " + remainingAfterFirstRound);

        // חישוב לאחר הסבב השני
        int remainingAfterSecondRound = calculateAfterSecondRound(remainingAfterFirstRound);
        System.out.println("Number of participants after the second round: " + remainingAfterSecondRound);
    }

    // פונקציה לחישוב מספר המשתתפים לאחר הסבב הראשון
    public static int calculateAfterFirstRound(int initialParticipants) {
        // המשתתף שיודח (משתתף שביעי)
        int participantToEliminate = 1;
        // חישוב המשתתפים הנותרים לאחר הסיבוב הראשון
        int remainingParticipants = initialParticipants - participantToEliminate;
        return remainingParticipants;
    }

    /**
     * חישוב מספר המשתתפים שנותרו לאחר הסבב השני.
     * 
     * @param remainingAfterFirstRound מספר המשתתפים שנותרו לאחר הסבב הראשון.
     * @return מספר המשתתפים שנותרו לאחר הסבב השני.
     */
    public static int calculateAfterSecondRound(int remainingAfterFirstRound) {
        // חישוב המשתתפים הנותרים לאחר הסיבוב השני
        // המשתתף האחרון שנותר בסיבוב הראשון הופך למשתתף הראשון בסיבוב השני
        int remainingAfterSecondRound = remainingAfterFirstRound - 1;
        return remainingAfterSecondRound;
    }
}