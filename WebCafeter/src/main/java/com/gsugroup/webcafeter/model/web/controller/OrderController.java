package com.gsugroup.webcafeter.model.web.controller;

import com.google.common.base.Preconditions;
import com.gsugroup.webcafeter.helper.RestURIConstants;
import com.gsugroup.webcafeter.model.RestPreconditions;
import com.gsugroup.webcafeter.model.entity.Order;
import com.gsugroup.webcafeter.model.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Maksim_Shurpo on 8/6/2014.
 */
@RestController
@RequestMapping(value = RestURIConstants.DomainURI.ORDER_DOMAIN)
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping(value = RestURIConstants.OrderURI.getOrders, method = RequestMethod.GET)
    @ResponseBody
    public List<Order> getOrders(@RequestHeader(value = RestURIConstants.OrderURI.offsetParam, required = true) Integer offset,
                                 @RequestHeader(value = RestURIConstants.OrderURI.countParam, required = true) Integer count,
                                 @RequestHeader(value = RestURIConstants.OrderURI.sortParam, required = true) String sort,
                                 @RequestHeader(value = RestURIConstants.OrderURI.sortColumnParam, required = true) String sortColumn){
        Page<Order> page = orderService.getPageLong(offset, count, sort, sortColumn);
        return page.getContent();
    }

    @RequestMapping(value = RestURIConstants.OrderURI.createOrder, method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Order createOrder(@RequestBody Order order){
        Preconditions.checkNotNull(order);
        return orderService.save(order);
    }

    @RequestMapping(value = RestURIConstants.OrderURI.updateOrder, method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void updateOrder(@RequestBody Order order){
        Preconditions.checkNotNull(order);
        RestPreconditions.checkFound(orderService.findById(order.getId()));
        orderService.update(order);
    }

    @RequestMapping(value = RestURIConstants.OrderURI.deleteOrder, method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void deleteOrder(@RequestBody Order order){
        orderService.deleteById(order.getId());
    }
}
