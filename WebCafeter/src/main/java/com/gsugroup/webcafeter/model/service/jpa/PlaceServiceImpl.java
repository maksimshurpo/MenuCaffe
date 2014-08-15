package com.gsugroup.webcafeter.model.service.jpa;

import com.gsugroup.webcafeter.model.entity.Place;
import com.gsugroup.webcafeter.model.repository.PlaceRepository;
import com.gsugroup.webcafeter.model.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Maksim_Shurpo on 8/6/2014.
 */
@Service("placeService")
@Repository
@Transactional
public class PlaceServiceImpl extends CommonService implements PlaceService {

    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public Page<Place> getPlacesLong(Integer offset, Integer count, String sort, String sortColumn) {
        PageRequest request = new PageRequest(offset, count, valueOfSort(sort), sortColumn);
        return placeRepository.findAll(request);
    }
}
