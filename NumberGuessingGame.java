import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int MIN = 1;
        final int MAX = 100;
        final int MAX_ATTEMPTS = 7;

        int score = 0;
        boolean playAgain = true;

        System.out.println("Welcome to the Number Guessing Game");

        while (playAgain) {

            int randomNumber = random.nextInt(MAX - MIN + 1) + MIN;
            int attemptsLeft = MAX_ATTEMPTS;
            boolean guessedCorrectly = false;

            System.out.println("\nI have generated a number between " + MIN + " and " + MAX + ".");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it!");

            while (attemptsLeft > 0) {
                System.out.print("\nEnter your guess: ");
                int userGuess = scanner.nextInt();

                attemptsLeft--;

                if (userGuess == randomNumber) {
                    System.out.println("🎉 Correct! You guessed the number!");
                    guessedCorrectly = true;
                    score += attemptsLeft + 1; // More points for fewer attempts
                    break;
                } else if (userGuess > randomNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Too low!");
                }

                System.out.println("Attempts remaining: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("\n❌ You've used all attempts!");
                System.out.println("The correct number was: " + randomNumber);
            }

            System.out.println("\nYour current score: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next();

            if (!response.equalsIgnoreCase("yes")) {
                playAgain = false;
            }
        }

        System.out.println("\n=== Game Over ===");
        System.out.println("Final Score: " + score);
        scanner.close();
    }
}