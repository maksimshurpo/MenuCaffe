package com.gsugroup.webcafeter.model.repository;

import com.gsugroup.webcafeter.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Maksim_Shurpo on 8/6/2014.
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
