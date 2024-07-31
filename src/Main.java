public class Main {
    public static void main(String[] args) {
        QuizGame newQuiz = new QuizGame();

        newQuiz.startQuiz();

        newQuiz.askQuestion(1, "What is the chemical symbol for water?", "H2O", "CO2", "O2", "A");
        newQuiz.askQuestion(2, "How many planets are in our solar system?", "7", "8", "9", "B");
        newQuiz.askQuestion(3, "What is the capital of France?", "Berlin", "Madrid", "Paris", "C");

        newQuiz.endQuiz();
    }
}