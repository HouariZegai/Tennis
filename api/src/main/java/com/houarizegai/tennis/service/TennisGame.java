package com.houarizegai.tennis.service;

public class TennisGame {

    private int firstPlayerScore;

    public String getScore() {
        if(firstPlayerScore == 1) {
            return "Fifteen Love";
        }

        return "Love All";
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }
}
