package com.houarizegai.tennis.controller;

import com.houarizegai.tennis.dto.InitGameDto;
import com.houarizegai.tennis.service.TennisGameService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/tennis")
@RequiredArgsConstructor
public class TennisController {

    private final TennisGameService tennisGameService;

    @PostMapping("/init")
    @ResponseStatus(HttpStatus.CREATED)
    public void initGame(@Valid @RequestBody InitGameDto initGameDto) {
        tennisGameService.initGame(initGameDto);
    }
}
