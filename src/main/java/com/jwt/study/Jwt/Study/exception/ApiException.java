package com.jwt.study.Jwt.Study.exception;

/**
 * Usar para erros gerais da api.
 */
public class ApiException extends RuntimeException {

    public ApiException(String message) {
        super(message);
    }

}
