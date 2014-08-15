package com.gsugroup.webcafeter.model.service;

import com.gsugroup.webcafeter.model.entity.Menu;
import org.springframework.data.domain.Page;

/**
 * Created by Maksim_Shurpo on 7/29/2014.
 */
public interface MenuService {
    public Page<Menu> getPageLong(Integer offset, Integer count, String sort, String sortColumn);
}
