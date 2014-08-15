package com.gsugroup.webcafeter.model.repository;

import com.gsugroup.webcafeter.model.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Maksim_Shurpo on 7/29/2014.
 */
public interface MenuRepository extends JpaRepository<Menu, Long> {
}
