package com.gsugroup.webcafeter.model.service;

import com.gsugroup.webcafeter.model.entity.Place;
import org.springframework.data.domain.Page;

/**
 * Created by Maksim_Shurpo on 8/6/2014.
 */
public interface PlaceService {

    public Page<Place> getPlacesLong(Integer offset, Integer count, String sort, String sortColumn);
}
