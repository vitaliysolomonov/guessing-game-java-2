package com.galvanize;

// Randomization solution #2 ONLY
import java.util.Random;

public class Application {
    public static void main(String[] args) {
        int minRange = 1; // Minimum allowable number that can be guessed
        int maxRange = 10; // Maximum allowable number that can be guessed
        int userGuess; // Define user guess, cast as integer (aka require that value is a number)
        boolean shouldGuess = true; // Should the user be able to guess

        /*
            Randomization Solution #1 ONLY
            Use Math.random(), multiplied by maxRange, plus minRange
            to get an "allowable" random number for our purposes.

            Cast as int using (int) for type ease-of-use when comparing values.
         */
        int randomizedNumber = (int)(Math.random() * maxRange + minRange);

        while (shouldGuess) {
            System.out.println("Guess: ");

            // Allow user to type a number in the prompt.
            Prompt myPrompt = new Prompt();
            userGuess = myPrompt.present();

            // CHECK if user guess is greater or less than our guessing range
            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Please provide a number equal to or between " + minRange + " and " + maxRange + ".");
            }

            // Check the randomizedNumber against the userGuess to determine if they match
            if (userGuess == randomizedNumber) {
                System.out.println("🎉 CONGRATS! You guessed correctly! " + randomizedNumber + " was the random number!\n");
                shouldGuess = false;
            } else {
                // Give user a hint based on their guess
                if (randomizedNumber > userGuess) {
                    System.out.println("Try again... guess a higher number.\n");
                } else {
                    System.out.println("Try again... guess a lower number.\n");
                }
            }
        }
    }
}