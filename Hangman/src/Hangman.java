import java.util.Random;
import java.util.Scanner;

public class Hangman{
    StringBuilder guessedWord;
    int triesLeft;
    String word;
    boolean[] guessedLetters = new boolean[26];

    String[] Words = {
        "Food", "Home", "Work", "Family", "Friend", "Phone", "Money", "Clothes",
        "Car", "Health", "Sleep", "School", "Exercise", "Shopping", "Bathroom",
        "Travel", "Meal", "Entertainment", "Routine", "Household" };


    public Hangman() {
        Random random = new Random();
        word = Words[random.nextInt(Words.length)];
        triesLeft = 6;
        guessedWord = new StringBuilder("_".repeat(word.length()));
    }

    public void play() {
        Scanner input = new Scanner(System.in);

        while (triesLeft > 0 && guessedWord.indexOf("_") != -1) {
            System.out.println("Word: " + guessedWord );
            System.out.println("Tries Left: " + triesLeft);
            System.out.println("Guess a letter: ");
            char guess = input.next().toUpperCase().charAt(0);

            if (guess < 'A' || guess > 'Z') {
                System.out.println("Invalid Input.");
            }

            if (guessedLetters[guess - 'A']) {
                System.out.println("You guessed that letter");
                continue;
            }

            guessedLetters[guess - 'A'] = true;


            if (word.indexOf(guess) != -1) {
                updateGuessedWord(guess);
            } else {
                triesLeft--;
                System.out.println("Incorrect guess.");
            }
        }

        if (guessedWord.indexOf("_") == -1) {
            System.out.println("Congratulations! You guessed the word: " + word);
        } else {
            System.out.println("Game over! The word was: " + word);
        }
    }

    private void updateGuessedWord(char guess) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess) {
                guessedWord.setCharAt(i, guess);
            }
        }
    }


    public static void main(String[] args) {
        Hangman game = new Hangman();
        game.play();
    }

}