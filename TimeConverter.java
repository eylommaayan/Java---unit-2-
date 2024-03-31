import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the time in minutes
        System.out.println("Enter the time in minutes:");
        int totalMinutes = scanner.nextInt();

        // Calculate hours and minutes
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Display the time in hours and minutes
        System.out.println("Time: " + hours + " hours " + minutes + " minutes");
    }
}
