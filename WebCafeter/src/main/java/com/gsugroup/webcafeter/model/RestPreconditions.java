package com.gsugroup.webcafeter.model;

import com.gsugroup.webcafeter.exception.ResourceNotFoundException;

/**
 * Created by Maksim_Shurpo on 7/28/2014.
 */
public class RestPreconditions {

    public static <T> T checkFound(final T resource){
        if (resource == null){
            throw new ResourceNotFoundException();
        }
        return resource;
    }
}
