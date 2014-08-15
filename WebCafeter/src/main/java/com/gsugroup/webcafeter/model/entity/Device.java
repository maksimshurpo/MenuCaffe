package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Maksim on 07.07.2014.
 */
@Entity
@Table(name = DBConstant.Tables.devices)
public class Device implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.DevicesColumns.numberDev)
    private int numberDev;

    @Column(name = DBConstant.DevicesColumns.name, nullable = false)
    private String name;

    @OneToMany
    @JoinColumn(name = DBConstant.OrdersColumns.idDevices, nullable = false)
    private List<Order> orders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getNumberDev() {
        return numberDev;
    }

    public String getName() {
        return name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setNumberDev(int numberDev) {
        this.numberDev = numberDev;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        String ordersResult = ", \"Orders\": [";
        for (Order o : getOrders()){
            ordersResult += o + ",";
        }
        String comma = ordersResult.substring(ordersResult.length() - 1);
        if(comma.equals(",")){
            ordersResult = ordersResult.substring(0, ordersResult.length() - 1);
        }
        ordersResult += "]";

        String result = "{\"id\": " + getId()
                + ", \"number\":" + "\"" + getNumberDev() + "\""
                + ", \"name\":" + "\"" + getName() + "\""
                + ordersResult
                + "}";
        return result;
    }
}
