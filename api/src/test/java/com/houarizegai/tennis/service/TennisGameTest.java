package com.houarizegai.tennis.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
class TennisGameTest {

    private TennisGame tennisGame;

    @BeforeEach
    public void setup() {
        tennisGame = new TennisGame();
    }

    @Test
    void shouldReturnLoveAll() {
        String score = tennisGame.getScore();
        assertEquals("Love All", score);
    }

    @Test
    void firstPlayerWinsFirstBall() {
        firstPlayerWins(1);
        String score = tennisGame.getScore();

        assertEquals("Fifteen Love", score);
    }

    @Test
    void firstPlayerWinsTwoBall() {
        firstPlayerWins(2);
        String score = tennisGame.getScore();

        assertEquals("Thirty Love", score);
    }

    @Test
    void firstPlayerWinsThreeBall() {
        firstPlayerWins(3);
        String score = tennisGame.getScore();

        assertEquals("Forty Love", score);
    }

    private void firstPlayerWins(int times) {
        for(int i = 0; i < times; i++) {
            tennisGame.firstPlayerWin();
        }
    }
}
