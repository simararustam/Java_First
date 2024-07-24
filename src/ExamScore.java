import java.util.Scanner;

public class ExamScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter exam score: ");
        int score = input.nextInt();
        char letter_grade = 'v';

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        }

        if (score >=91 && score <= 100) {
            letter_grade = 'A';
        } else if (score >=81 && score <= 90) {
            letter_grade = 'B';
        } else if (score >=71 && score <= 80) {
            letter_grade = 'C';
        } else if (score >=61 && score <= 70) {
            letter_grade = 'D';
        } else if (score >= 0 && score <= 60) {
            letter_grade = 'F';
        }

        System.out.print("Letter Grade " + letter_grade + ". ");

        switch (letter_grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Well done.");
                break;
            case 'D':
                System.out.println("You passed.");
                break;
            case 'F':
                System.out.println("Better luck next time.");
                break;
        }
    }
}
