package com.houarizegai.tennis.service;

public class TennisGame {

    private int firstPlayerScore;

    public String getScore() {
        if(firstPlayerScore == 1) {
            return "Fifteen Love";
        }
        if(firstPlayerScore == 2) {
            return "Thirty Love";
        }

        return "Love All";
    }

    public void firstPlayerWin() {
        firstPlayerScore++;
    }
}
