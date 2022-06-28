package com.houarizegai.tennis.service;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private int firstPlayerScore;
    private int secondPlayerScore;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    public String getScore() {
        if(firstPlayerScore == secondPlayerScore) {
            return "Love All";
        }
        if(secondPlayerScore == 1) {
            return "Love Fifteen";
        }

        return SCORES.get(firstPlayerScore) + " Love";
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }

    public void secondPlayerWin() {
        secondPlayerScore++;
    }
}
