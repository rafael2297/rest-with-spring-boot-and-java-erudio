package com.rafael2297.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathOperatinExcepption extends RuntimeException {

    public UnsupportedMathOperatinExcepption(String message) {

        super(message);
    }
}
