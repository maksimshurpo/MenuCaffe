package com.gsugroup.webcafeter.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Maksim_Shurpo on 7/28/2014.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
    private static final String MESSAGE = "cannot find resources : " + ResourceNotFoundException.class.getClass().getPackage();

    public ResourceNotFoundException() {
        super(MESSAGE);
    }
}
