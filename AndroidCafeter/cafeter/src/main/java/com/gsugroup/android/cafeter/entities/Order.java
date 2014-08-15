package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class Order implements Parcelable{

    private int id;

    private String timestamp;

    private int numberOrder;

    private DishesMenu dishesMenu;

    public static final Creator<Order> CREATOR = new Creator<Order>() {
        @Override
        public Order createFromParcel(Parcel source) {
            Order order = new Order();
            order.setId(source.readInt());
            order.setTimestamp(source.readString());
            order.setNumberOrder(source.readInt());
            order.setDishesMenu((DishesMenu)source.readParcelable(DishesMenu.class.getClassLoader()));
            return order;
        }

        @Override
        public Order[] newArray(int size) {
            return new Order[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(timestamp);
        dest.writeInt(numberOrder);
        dest.writeParcelable(dishesMenu, flags);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public int getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(int numberOrder) {
        this.numberOrder = numberOrder;
    }

    public DishesMenu getDishesMenu() {
        return dishesMenu;
    }

    public void setDishesMenu(DishesMenu dishesMenu) {
        this.dishesMenu = dishesMenu;
    }
}
