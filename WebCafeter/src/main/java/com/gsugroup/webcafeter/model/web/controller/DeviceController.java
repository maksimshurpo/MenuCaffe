package com.gsugroup.webcafeter.model.web.controller;

import com.gsugroup.webcafeter.helper.RestURIConstants;
import com.gsugroup.webcafeter.model.entity.Device;
import com.gsugroup.webcafeter.model.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Maksim_Shurpo on 7/23/2014.
 */

@RestController
@RequestMapping(value = RestURIConstants.DomainURI.DOMAIN_DEVICE)
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @RequestMapping(value = RestURIConstants.DeviceURI.getDeviceInfo, method = RequestMethod.GET, params = {RestURIConstants.DeviceURI.offsetParam, RestURIConstants.DeviceURI.countParam,
            RestURIConstants.DeviceURI.sortParam, RestURIConstants.DeviceURI.sortColumnParam})
    @ResponseBody
    public List<Device> getDevices(@RequestParam(value = RestURIConstants.DeviceURI.offsetParam, required = true) Integer offset,
                                   @RequestParam(value = RestURIConstants.DeviceURI.countParam, required = true) Integer count,
                                   @RequestParam(value = RestURIConstants.DeviceURI.sortParam, required = true) String sort,
                                   @RequestParam(value = RestURIConstants.DeviceURI.sortColumnParam, required = true) String sortColumn){
        Page<Device> page = deviceService.getDevicesLong(offset, count, sort, sortColumn);
        return page.getContent();
    }
}
