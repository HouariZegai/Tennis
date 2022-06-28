package com.houarizegai.tennis.dto;

import com.houarizegai.tennis.model.Player;

public record GameScoreDto(Player firstPlayer, Player secondPlayer, String score) {
}
