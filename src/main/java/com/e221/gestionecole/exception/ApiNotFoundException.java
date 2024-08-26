package com.e221.gestionecole.exception;

public class ApiNotFoundException extends RuntimeException{
    public ApiNotFoundException(String message) {
        super(message);
    }
}

