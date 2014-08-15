package com.gsugroup.webcafeter.model.service;

import com.gsugroup.webcafeter.model.entity.Device;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * Created by Maksim on 07.07.2014.
 */
public interface DeviceService {

    public Device findById(long id);
    public List<Device> findAll();
    public Page<Device> getDevicesLong(Integer offset, Integer count, String sort, String sortColumn);
}
