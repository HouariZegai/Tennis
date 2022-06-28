package com.houarizegai.tennis.exception;

public class GameNotInitException extends RuntimeException {

    private static final String MESSAGE = "Game is not initialized";

    public GameNotInitException() {
        super(MESSAGE);
    }
}
