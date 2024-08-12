import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int round = 1, user_score = 0;

        while (true) {
            int randomNumber = rand.nextInt(2);

            System.out.print("\"Heads (H) \" or \"Tails (T): ");
            String promt =  input.next();

            if (!promt.equalsIgnoreCase("H") && !promt.equalsIgnoreCase("T")) {
                System.out.println("Please write only H (Heads) or T (Tails)");
                continue;
            }

            boolean isheads = promt.equalsIgnoreCase("H");
            boolean coinIsHead = randomNumber == 1;

            if ((isheads && coinIsHead) || (!isheads && !coinIsHead)) {
                System.out.println("Correct!");
                user_score++;
            } else {
                System.out.println("False!");
            }

            while (true) {
                System.out.print("Continue (C) or not (N): ");
                String endOrNot = input.next();

                if (endOrNot.equalsIgnoreCase("C")) {
                    round++;
                    break;
                } else if (endOrNot.equalsIgnoreCase("N")) {
                    System.out.println("Round num : " + round);
                    System.out.println("User score : " + user_score);
                    input.close();
                    return; //exit program
                } else {
                    System.out.println("Please choose only 'C' (continue) or 'N' (not)...");
                }
            }

        }
    }
}
