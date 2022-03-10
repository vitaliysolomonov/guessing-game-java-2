package com.galvanize;

import java.util.HashMap;
import java.util.Map;

public class GameClasses {

    //private String name;
    boolean isPlaying = true;
    int guessNumber;
    HashMap<String, Integer> leaderMap = new HashMap<>();
    String bestPlayer;

    public int randomNumber() {
        return (int) (Math.random() * 10 + 1);
    }


    public String guessOnce(int random, String name, int numberOfGuesses, String history) {


        guessNumber = Prompt.present();
        if (guessNumber > random)
            return String.format("Sorry, %s! You guessed incorrectly. Try guessing a lower number!", name);
        else if (guessNumber < random)
            return String.format("Sorry, %s! You guessed incorrectly. Try guessing a higher number!", name);
        else {
            isPlaying = false;
            return String.format("Congrats, %s! You guessed correctly, the number was %d! Previous guess(es): %s\n%s", name, guessNumber, history, bestResultString(name, numberOfGuesses));
        }
    }

    public void updateLeaderBoard(String name, int numberOfGuesses) {
        if (leaderMap.containsKey(name) && leaderMap.get(name) > numberOfGuesses)
            leaderMap.put(name, numberOfGuesses);
        else if (!leaderMap.containsKey(name))
            leaderMap.put(name, numberOfGuesses);
            }

    public int bestResult() {

        if (leaderMap.size() > 0) {

            int lowestScore = 0;
            for (Map.Entry mapElement : leaderMap.entrySet()) {
                if (lowestScore == 0) {
                    lowestScore = (int) mapElement.getValue();
                    bestPlayer = (String) mapElement.getKey();

                } else if (lowestScore > (int) mapElement.getValue()) {
                    lowestScore = (int) mapElement.getValue();
                    bestPlayer = (String) mapElement.getKey();
                }
            } return lowestScore;
        } else return 0;
    }

    public String bestResultString (String name, Integer numberOfGuesses) {
        if (leaderMap.size() > 0) {
            int bestScore = bestResult();
            if (numberOfGuesses < bestScore && name.equals(bestPlayer))
                return "You beat your last score " + bestScore;
            else if (numberOfGuesses < bestScore)
                return "You beat " + bestPlayer + " who scored " + bestScore;
            else if (numberOfGuesses > bestScore && name.equals(bestPlayer))
                return "You did not beat your last score " + bestScore;
            else if (numberOfGuesses > bestScore)
                return "You did not beat " + bestPlayer + " who scored " + bestScore;
            else if (name.equals(bestPlayer))
                return "You tied with your last score " + bestScore;
            else return "You tied with " + bestPlayer + " who also scored " + bestScore;
        } else return "You played first time. ";
    }
}