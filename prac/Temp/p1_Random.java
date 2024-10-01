package Temp;

import java.util.Scanner; // for input
import java.util.Random; // for random number generation

public class p1_Random {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber, guess;

        // Generate secret number between 1 and 10 only once at the start
        secretNumber = random.nextInt(10) + 1;

        System.out.println("A secret number between 1 and 10 has been generated.");

        do {
            System.out.print("Guess the number (1 to 10): ");
            guess = scanner.nextInt(); // Take user input

            if (secretNumber < guess) {
                System.out.println("The secret number is lower");
            } else if (secretNumber > guess) {
                System.out.println("The secret number is higher");
            }

        } while (secretNumber != guess);

        System.out.println("Congratulations! You've guessed the secret number.");

        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
