package com.jwt.study.Jwt.Study.exception;


public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

	public NotFoundException(final String message) {
        super(message);
    }

    public NotFoundException() {
        this("Recurso não encontrado!");
    }
}

