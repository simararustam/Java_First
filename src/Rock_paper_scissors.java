import java.util.Scanner;

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice_num = (int)(Math.random() * 3);

        int comp_score = 0;
        int user_score = 0;
        int round = 1;

        while (true) {

            String[] choices = {"Rock", "Paper", "Scissors"};
            String comp_selection = choices[choice_num];

            System.out.print("Rock\nPaper\nScissors \n.....\n");
            String user_selection = input.next();

            if (user_selection.equalsIgnoreCase("S")) user_selection = "Scissors";
            if (user_selection.equalsIgnoreCase("R")) user_selection = "Rock";
            if (user_selection.equalsIgnoreCase("p")) user_selection = "Paper";


            if (comp_selection.equals("Rock") && user_selection.equals("Scissors")){
                System.out.println("Comp win");
                comp_score++;
            } else if (comp_selection.equals("Scissors") && user_selection.equals("Paper")) {
                System.out.println("Comp win");
                comp_score++;
            } else if (comp_selection.equals("Paper") && user_selection.equals("Rock")) {
                System.out.println("Comp win");
                comp_score++;
            }else if (user_selection.equals("Rock") && comp_selection.equals("Scissors")) {
                System.out.println("User win");
                user_score++;
            } else if (user_selection.equals("Scissors") && comp_selection.equals("Paper")) {
                System.out.println("User win");
                user_score++;
            } else if (user_selection.equals("Paper") && comp_selection.equals("Rock")) {
                System.out.println("User win");
                user_score++;
            }else if (user_selection.equals(comp_selection)) {
                System.out.println("tie");
            } else {
                System.out.println("Please choose Rock, Paper, or Scissors.");
                continue;
            }

            while (true) {
                System.out.print("Continue (C) or not (N) : ");
                String endOrNot = input.next();

                if (endOrNot.equalsIgnoreCase("C")) {
                    round++;
                    break;
                } else if (endOrNot.equalsIgnoreCase("N")) {
                    System.out.println("Round num : " + round);
                    System.out.print("USER SCORE :" + user_score + '\n');
                    System.out.print("COMP SCORE :" + comp_score);
                    input.close();
                    return;
                } else {
                    System.out.println("Choose only 'continue' or 'not'...");
                }
            }
        }
    }
}
