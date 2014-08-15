package com.gsugroup.webcafeter.model.service.jpa;

import com.google.common.collect.Lists;
import com.gsugroup.webcafeter.model.entity.Device;
import com.gsugroup.webcafeter.model.repository.DeviceRepository;
import com.gsugroup.webcafeter.model.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Maksim on 07.07.2014.
 */
@Service("deviceService")
@Repository
@Transactional
public class DeviceServiceImpl extends CommonService implements DeviceService {

    @Autowired
    private DeviceRepository devicesRepository;

    @Override
    public Device findById(long id) {
        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Device> findAll() {
        return Lists.newArrayList(devicesRepository.findAll());
    }

    @Override
    @Transactional
    public Page<Device> getDevicesLong(Integer offset, Integer count, String sort, String sortColumn) {
        PageRequest request = new PageRequest(offset, count, valueOfSort(sort), sortColumn);
        return devicesRepository.findAll(request);
    }
}
