package com.houarizegai.tennis.service;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private final String firstPlayerName;
    private final String secondPlayerName;

    private int firstPlayerScore;
    private int secondPlayerScore;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(0, "Love");
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    public TennisGame(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {
        if(firstPlayerScore == secondPlayerScore) {
            if(firstPlayerScore >= 3) {
                return "Deuce";
            }

            return SCORES.get(firstPlayerScore) + " All";
        }

        String highestPlayerName = getHighestPlayerName();
        if(firstPlayerScore > 3 || secondPlayerScore > 3) {
            if(Math.abs(firstPlayerScore - secondPlayerScore) == 1) {
                return highestPlayerName + " Advantage";
            }
            if(Math.abs(firstPlayerScore - secondPlayerScore) >= 2) {
                return highestPlayerName + " Win";
            }
        }

        return SCORES.get(firstPlayerScore) + " " + SCORES.get(secondPlayerScore);
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }

    public void secondPlayerWin() {
        secondPlayerScore++;
    }

    private String getHighestPlayerName() {
        return firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
    }
}
