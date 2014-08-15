package com.gsugroup.webcafeter.model.repository;

import com.gsugroup.webcafeter.model.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by Maksim on 07.07.2014.
 */
public interface DeviceRepository extends JpaRepository<Device, Long> {
}
