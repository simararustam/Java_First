import java.util.Scanner;

public class QuizGame {
    int score = 0;
    Scanner scanner = new Scanner(System.in);

    public void startQuiz() {
        System.out.println("Welcome to the Science Quiz!\n");
    }

    public void askQuestion(int ques_num, String question, String opt1, String opt2, String opt3, String correct_ans) {
        System.out.println("Question " + ques_num + ": " + question);
        System.out.println("A)" + opt1 + " " + "B)" + opt2 + " " + "C) " + opt3);
        System.out.print("Your answer: ");
        String user_answer = scanner.nextLine().trim().toLowerCase();
        evaluateAnswer(correct_ans, user_answer);
    }

    public void evaluateAnswer(String correct_ans, String user_answer) {
        if (correct_ans.equalsIgnoreCase(user_answer)) {
            System.out.println("Correct answer");
            score++;
        } else {
            System.out.println("Wrong answer.");
        }
    }

    public void endQuiz() {
        System.out.println("\nScore : " + score);
    }



    public static void main(String[] args) {
        QuizGame newQuiz = new QuizGame();

        newQuiz.startQuiz();

        newQuiz.askQuestion(1, "What is the chemical symbol for water?", "H2O", "CO2", "O2", "A");
        newQuiz.askQuestion(2, "How many planets are in our solar system?", "7", "8", "9", "B");
        newQuiz.askQuestion(3, "What is the capital of France?", "Berlin", "Madrid", "Paris", "C");

        newQuiz.endQuiz();
    }
}
