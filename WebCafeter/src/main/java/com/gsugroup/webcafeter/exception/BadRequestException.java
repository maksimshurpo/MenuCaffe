package com.gsugroup.webcafeter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Maksim_Shurpo on 7/28/2014.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    private static final String MESSAGE = "incorrect input restful request : " + ResourceNotFoundException.class.getClass().getPackage();

    public BadRequestException() {
        super(MESSAGE);
    }
}
