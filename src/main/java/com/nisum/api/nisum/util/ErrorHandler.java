package com.nisum.api.nisum.util;

import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler(JdbcSQLIntegrityConstraintViolationException.class)
    public ResponseEntity<Object> exception(JdbcSQLIntegrityConstraintViolationException exception) {
        return new ResponseEntity<>("Message : " + ErrorEnum.EMAIL_ALREADY_EXISTS.getValue(), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> exception(MethodArgumentNotValidException exception) {
        return new ResponseEntity<>("Message : " + ErrorEnum.EMPTY_FIELDS.getValue(), HttpStatus.BAD_REQUEST);
    }
}
