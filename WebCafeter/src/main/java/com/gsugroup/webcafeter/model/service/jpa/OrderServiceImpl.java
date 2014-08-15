package com.gsugroup.webcafeter.model.service.jpa;

import com.gsugroup.webcafeter.model.entity.Order;
import com.gsugroup.webcafeter.model.repository.OrderRepository;
import com.gsugroup.webcafeter.model.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Maksim_Shurpo on 8/6/2014.
 */
@Service("orderService")
@Repository
@Transactional
public class OrderServiceImpl extends CommonService implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public Page<Order> getPageLong(Integer offset, Integer count, String sort, String sortColumn) {
        PageRequest page = new PageRequest(offset, count, valueOfSort(sort), sortColumn);
        return orderRepository.findAll(page);
    }

    @Override
    public Order save(Order order) {
        if (order.getId() != 0) {
            return null;
        }
        return orderRepository.save(order);
    }

    @Override
    public Order update(Order order) {
        if(order.getId() != 0) {
            return orderRepository.save(order);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        orderRepository.delete(id);
    }

    @Override
    public Order findById(Long id) {
        return orderRepository.findOne(id);
    }
}
