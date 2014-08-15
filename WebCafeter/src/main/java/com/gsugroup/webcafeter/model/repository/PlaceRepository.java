package com.gsugroup.webcafeter.model.repository;

import com.gsugroup.webcafeter.model.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Maksim_Shurpo on 8/5/2014.
 */
public interface PlaceRepository extends JpaRepository<Place, Long> {
}
