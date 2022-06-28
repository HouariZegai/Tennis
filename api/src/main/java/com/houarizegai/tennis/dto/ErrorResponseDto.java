package com.houarizegai.tennis.dto;

import java.time.ZonedDateTime;
import java.util.List;

public record ErrorResponseDto(ZonedDateTime timestamp, int status, List<String> errors){
}
