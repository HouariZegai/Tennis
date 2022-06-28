package com.houarizegai.tennis.dto;

import javax.validation.constraints.NotBlank;

public record InitGameDto(
        @NotBlank(message = "First player name is required")
        String firstPlayerName,

        @NotBlank(message = "Second player name is required")
        String secondPlayerName
) {
}
