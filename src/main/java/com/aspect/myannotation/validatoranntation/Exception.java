package com.aspect.myannotation.validatoranntation;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class Exception {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public Map<String, String> exp(MethodArgumentNotValidException exception) {
        HashMap<String, String> map = new HashMap<>();
        exception.getBindingResult().getFieldErrors()
            .forEach(fieldError -> map.put(fieldError.getField(), fieldError.getDefaultMessage()));
        return map;
    }
}
