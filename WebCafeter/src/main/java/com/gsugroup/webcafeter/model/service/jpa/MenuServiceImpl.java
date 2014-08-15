package com.gsugroup.webcafeter.model.service.jpa;

import com.gsugroup.webcafeter.model.entity.Menu;
import com.gsugroup.webcafeter.model.repository.MenuRepository;
import com.gsugroup.webcafeter.model.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Maksim_Shurpo on 7/29/2014.
 */
@Service("menuService")
@Repository
@Transactional
public class MenuServiceImpl extends CommonService implements MenuService{

    @Autowired
    private MenuRepository menuRepository;

    @Override
    public Page<Menu> getPageLong(Integer offset, Integer count, String sort, String sortColumn) {
        PageRequest page = new PageRequest(offset, count, valueOfSort(sort), sortColumn);
        return menuRepository.findAll(page);
    }
}
