package com.gsugroup.webcafeter.model.service;

import com.gsugroup.webcafeter.model.entity.Order;
import org.springframework.data.domain.Page;

/**
 * Created by Maksim_Shurpo on 8/6/2014.
 */
public interface OrderService {
    public Page<Order> getPageLong(Integer offset, Integer count, String sort, String sortColumn);
    public Order save(Order order);
    public Order update(Order order);
    public void deleteById(Long id);
    public Order findById(Long id);
}
