package com.houarizegai.tennis.exception;

import com.houarizegai.tennis.dto.ErrorResponseDto;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.ZonedDateTime;
import java.util.Collections;
import java.util.List;

@ControllerAdvice
@RestController
public class GlobalExceptionHandlerController extends ResponseEntityExceptionHandler {

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
                                                                  HttpHeaders headers,
                                                                  HttpStatus status, WebRequest request) {
        List<String> errors = ex.getBindingResult().getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage)
                .toList();
        ErrorResponseDto body = new ErrorResponseDto(ZonedDateTime.now(), status.value(), errors);

        return new ResponseEntity<>(body, headers, status);
    }

    @ExceptionHandler(value = {GameNotInitException.class, IllegalPlayerTypeException.class})
    public ResponseEntity<ErrorResponseDto> handleUnprocessableEntityExceptions(RuntimeException ex) {
        HttpStatus status = HttpStatus.UNPROCESSABLE_ENTITY;

        ErrorResponseDto body = new ErrorResponseDto(ZonedDateTime.now(), status.value(), Collections.singletonList(ex.getMessage()));
        return new ResponseEntity<>(body, status);
    }
}