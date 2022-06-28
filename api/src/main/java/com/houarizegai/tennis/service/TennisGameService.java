package com.houarizegai.tennis.service;

import com.houarizegai.tennis.dto.GameScoreDto;
import com.houarizegai.tennis.dto.InitGameDto;
import com.houarizegai.tennis.dto.PlayerTypeDto;

public interface TennisGameService {
    void initGame(InitGameDto initGameDto);

    GameScoreDto getScore();

    void recordScore(PlayerTypeDto playerTypeDto);
}
