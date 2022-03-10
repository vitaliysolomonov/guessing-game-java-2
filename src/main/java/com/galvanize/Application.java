package com.galvanize;
public class Application {

    public static void main(String[] args) {
        // Get started here...
        GameClasses game = new GameClasses();

        int numberOfGuesses;

        String playAgainAnswer;
        do {
            int random = game.randomNumber();
            game.isPlaying = true;
            StringBuilder history = new StringBuilder();
            numberOfGuesses = 0;
            System.out.println("What is you name? ");
            String name = Prompt.presentName();
            System.out.println("Guess number from 1-10: ");
            do {
                numberOfGuesses++;
                System.out.println(game.guessOnce(random, name, numberOfGuesses, String.valueOf(history)));
                if (game.isPlaying) {
                    if (history.length() == 0)
                        history.append(game.guessNumber);
                    else history.append(",").append(game.guessNumber);
                }
            } while (game.isPlaying);

         //   String resultString = game.bestResultString(name, numberOfGuesses);

            game.updateLeaderBoard(name, numberOfGuesses);

            do {
                System.out.println("Do you want to play again? (y/n/yes/no): ");
                playAgainAnswer = Prompt.presentName();
            } while (!(playAgainAnswer.equals("y") || playAgainAnswer.equals("n") || playAgainAnswer.equals("yes") || playAgainAnswer.equals("no")));

        } while (playAgainAnswer.equals("y") || playAgainAnswer.equals("yes"));

    }
}



/*


    FOR REFERENCE, USE BELOW CODE TO COLLECT INPUT (THE USER'S GUESS)
    ---

    int userGuess; // the user's guess
    System.out.println("Guess: "); // message prompting the user to input a number in the terminal
    userGuess = Prompt.present(); // collect the user's input (their guess) as userGuess


 */