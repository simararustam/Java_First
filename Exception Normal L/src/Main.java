import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filepath = "./participants.txt";

        // Register a participant
        try {
            System.out.print("Enter participant's name: ");
            String name = scanner.nextLine();

            System.out.print("Enter participant's age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter participant's email: ");
            String email = scanner.nextLine();

            Participant participant = new Participant(name, age, email);
            Participant.saveParticipiant(participant, filepath);

            System.out.println("Participant registered successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for age. Please enter a valid number.");
        } catch (Exception e) {
            System.out.println("An error occurred during registration: " + e.getMessage());
        }

        // Display all participants
        System.out.println("\nList of Participants:");
        Participant.displayParticipants(filepath);
    }
}