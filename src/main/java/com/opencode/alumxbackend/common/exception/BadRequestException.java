package com.opencode.alumxbackend.common.exception;

/**
 * class to handle Bad Request Exception
 */
public class BadRequestException  extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public BadRequestException() {}

    public BadRequestException(String message) {
        super(message);
    }
}