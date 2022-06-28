package com.houarizegai.tennis.service;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {

    private int firstPlayerScore;

    private static final Map<Integer, String> SCORES = new HashMap<>();

    static {
        SCORES.put(1, "Fifteen");
        SCORES.put(2, "Thirty");
        SCORES.put(3, "Forty");
    }

    public String getScore() {
        if(firstPlayerScore == 0) {
            return "Love All";
        }

        return SCORES.get(firstPlayerScore) + " Love";
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }
}
