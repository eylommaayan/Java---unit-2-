import java.util.Scanner;

public class SevenBoomGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the initial number of participants
        System.out.println("Enter the initial number of participants:");
        int initialParticipants = scanner.nextInt();

        // Calculate the number of participants after the first round
        int remainingAfterFirstRound = calculateAfterFirstRound(initialParticipants);
        System.out.println("Number of participants after the first round: " + remainingAfterFirstRound);

        // Calculate the number of participants after the second round
        int remainingAfterSecondRound = calculateAfterSecondRound(remainingAfterFirstRound);
        System.out.println("Number of participants after the second round: " + remainingAfterSecondRound);
    }

    // Function to calculate the number of participants after the first round
    public static int calculateAfterFirstRound(int initialParticipants) {
        // The participant to be eliminated (7th participant)
        int participantToEliminate = 1;
        // Calculate the remaining participants after the first round
        int remainingParticipants = initialParticipants - participantToEliminate;
        return remainingParticipants;
    }

    /**
     * Calculates the number of participants remaining after the second round.
     * 
     * @param remainingAfterFirstRound The number of participants remaining after the first round.
     * @return The number of participants remaining after the second round.
     */
    public static int calculateAfterSecondRound(int remainingAfterFirstRound) {
        // Calculate the remaining participants after the second round
        // The last participant remaining in the first round becomes the first participant in the second round
        int remainingAfterSecondRound = remainingAfterFirstRound - 1;
        return remainingAfterSecondRound;
    }
}