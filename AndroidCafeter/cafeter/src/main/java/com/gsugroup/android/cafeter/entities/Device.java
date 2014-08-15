package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class Device implements Parcelable{

    private int id;

    private int numberDev;

    private String name;

    private List<Order> orders;

    public static final Creator<Device> CREATOR = new Creator<Device>() {
        @Override
        public Device createFromParcel(Parcel source) {
            List<Order> orderList = new ArrayList<Order>();
            Device device = new Device();
            device.setId(source.readInt());
            device.setName(source.readString());
            device.setNumberDev(source.readInt());
            source.readList(orderList, null);
            device.setOrders(orderList);
            return device;
        }

        @Override
        public Device[] newArray(int size) {
            return new Device[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(numberDev);
        dest.writeString(name);
        dest.writeList(orders);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberDev() {
        return numberDev;
    }

    public void setNumberDev(int numberDev) {
        this.numberDev = numberDev;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }
}
