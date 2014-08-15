package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by Maksim on 15.07.2014.
 */
@Entity
@Table(name = DBConstant.Tables.dishesMenu)
public class DishesMenu implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.DishesMenuColumns.cost, nullable = false)
    private Double cost;

    @Column(name = DBConstant.DishesMenuColumns.cookingTime)
    private int cookingTime;

    @OneToOne
    @JoinColumn(name = DBConstant.DishesMenuColumns.idDishesInternalization, nullable = false)
    private DishesInternalization dishesInternalization;

    @OneToMany
    @JoinColumn(name = DBConstant.ContentsColumns.idDishesMenu)
    private List<Content> contents;

    public long getId() {
        return id;
    }

    public Double getCost() {
        return cost;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public List<Content> getContents() {
        return contents;
    }

    public DishesInternalization getDishesInternalization() {
        return dishesInternalization;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public void setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }

    public void setDishesInternalization(DishesInternalization dishesInternalization) {
        this.dishesInternalization = dishesInternalization;
    }

    @Override
    public String toString() {
        String contents = ", \"Contents\": [";
        for (Content d : getContents()){
            contents += d + ",";
        }
        String comma = contents.substring(contents.length() - 1);
        if(comma.equals(",")){
            contents = contents.substring(0, contents.length() - 1);
        }
        contents += "]";
        return "{"
                + "\"id\": " + id
                + ", \"cost\": " + cost
                + ", \"cookingTime\": " + cookingTime
                + contents
                + ", \"DishesInternalization\": " + dishesInternalization
                + "}";
    }
}
