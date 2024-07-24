import java.util.Scanner;


public class numberGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the Guess the Number Game!\n" +
                "I'm thinking of a number between 1 and 10.");
        Scanner input = new Scanner(System.in);

        int rand = (int)(Math.random() * (10 + 1));

        int round = 0;
        while ( round != 5 ) {
            System.out.print("Enter your guess: ");
            int num = input.nextInt();

            if (num == rand) {
                System.out.println("Congratulations!");
                break;
            } else if (num < rand) {
                System.out.println("Too low.");
                round++;
                if (round == 5) System.out.println("Finish :(");
            } else {
                System.out.println("Too high.");
                round++;
                if (round == 5) System.out.println("Finish :(");
            }
        }
    }
}
