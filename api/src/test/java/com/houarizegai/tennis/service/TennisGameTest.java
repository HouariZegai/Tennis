package com.houarizegai.tennis.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
class TennisGameTest {

    @Test
    void shouldReturnLoveAll() {
        TennisGame tennisGame = new TennisGame();
        String score = tennisGame.getScore();
    }
}
