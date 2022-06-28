package com.houarizegai.tennis.service.impl;

import com.houarizegai.tennis.service.TennisGame;
import com.houarizegai.tennis.service.TennisGameService;
import com.houarizegai.tennis.dto.InitGameDto;
import org.springframework.stereotype.Service;

@Service
public class TennisGameServiceImpl implements TennisGameService {

    private TennisGame tennisGame;

    @Override
    public void initGame(InitGameDto initGameDto) {
        tennisGame = new TennisGame(initGameDto.firstPlayerName(), initGameDto.secondPlayerName());
    }
}
