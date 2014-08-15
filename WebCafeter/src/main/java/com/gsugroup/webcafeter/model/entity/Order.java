package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Maksim on 15.07.2014.
 */
@Entity
@Table(name = DBConstant.Tables.orders)
public class Order implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.OrdersColumns.timeStamp, nullable = false)
    private Date timestamp;

    @Column(name = DBConstant.OrdersColumns.numberOrder, nullable = false)
    private int numberOrder;

    @ManyToOne
    @JoinColumn(name = DBConstant.OrdersColumns.idDishesMenu, nullable = false)
    private DishesMenu dishesMenu;

    public long getId() {
        return id;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public DishesMenu getDishesMenu() {
        return dishesMenu;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public void setDishesMenu(DishesMenu dishesMenu) {
        this.dishesMenu = dishesMenu;
    }

    @Override
    public String toString() {
        String timestampResult = "null";
        if(getTimestamp() != null){
            timestampResult = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(getTimestamp());
        }
        String result = "{"
                + "\"id\": " + getId()
                + ", \"Timestamp\": " + "\"" +  timestampResult + "\""
                + ", \"NumberOrder\": " + getNumberOrder()
                + ", \"DishesMenu\": " + getDishesMenu()
                + "}";
        return result;
    }
}
