package com.gsugroup.webcafeter.model.service.jpa;

import org.springframework.data.domain.Sort;

/**
 * Created by Maksim_Shurpo on 7/23/2014.
 */
public class CommonService {

    protected Sort.Direction valueOfSort(String sort){
        if(sort.toLowerCase().equals("ASC")){
            return Sort.Direction.ASC;
        }else if (sort.toLowerCase().equals("DESC")){
            return Sort.Direction.DESC;
        }else {
            return Sort.Direction.fromString(sort);
        }
    }
}
