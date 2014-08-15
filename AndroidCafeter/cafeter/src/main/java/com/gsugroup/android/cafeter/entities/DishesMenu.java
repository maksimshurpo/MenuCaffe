package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class DishesMenu implements Parcelable{

    private int id;

    private Double cost;

    private int cookingTime;

    private DishesInternalization dishesInternalization;

    private List<Content> contents;

    public static final Creator<DishesMenu> CREATOR = new Creator<DishesMenu>() {
        @Override
        public DishesMenu createFromParcel(Parcel source) {
            List<Content> contentList = new ArrayList<Content>();
            DishesMenu dishesMenu = new DishesMenu();
            dishesMenu.setId(source.readInt());
            dishesMenu.setCost(source.readDouble());
            dishesMenu.setCookingTime(source.readInt());
            dishesMenu.setDishesInternalization((DishesInternalization) source.readParcelable(DishesInternalization.class.getClassLoader()));
            source.readList(contentList, null);
            dishesMenu.setContents(contentList);
            return null;
        }

        @Override
        public DishesMenu[] newArray(int size) {
            return new DishesMenu[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeDouble(cost);
        dest.writeInt(cookingTime);
        dest.writeParcelable(dishesInternalization, flags);
        dest.writeList(contents);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public DishesInternalization getDishesInternalization() {
        return dishesInternalization;
    }

    public void setDishesInternalization(DishesInternalization dishesInternalization) {
        this.dishesInternalization = dishesInternalization;
    }

    public List<Content> getContents() {
        return contents;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
}
