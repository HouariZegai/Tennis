package com.houarizegai.tennis.service;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private int firstPlayerScore;
    private int secondPlayerScore;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(0, "Love");
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    public String getScore() {
        if(firstPlayerScore == secondPlayerScore) {
            if(firstPlayerScore == 1) {
                return "Fifteen All";
            }
            if(firstPlayerScore == 2) {
                return "Thirty All";
            }
            if(firstPlayerScore == 3) {
                return "Deuce";
            }
            return "Love All";
        }

        return SCORES.get(firstPlayerScore) + " " + SCORES.get(secondPlayerScore);
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }

    public void secondPlayerWin() {
        secondPlayerScore++;
    }
}
