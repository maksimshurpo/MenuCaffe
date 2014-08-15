package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Maksim on 09.07.2014.
 */
@Entity
@Table(name = DBConstant.Tables.sectionMenu)
public class SectionMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @OneToOne
    @JoinColumn(name = DBConstant.SectionMenuColumns.idSectionInternalization, nullable = false)
    private SectionInternalization sectionInternalization;

    @OneToMany
    @JoinColumn(name = DBConstant.DishesMenuColumns.idSectionMenu, nullable = false)
    private Set<DishesMenu> dishesMenu;

    public long getId() {
        return id;
    }

    public SectionInternalization getSectionInternalization() {
        return sectionInternalization;
    }

    public Set<DishesMenu> getDishesMenu() {
        return dishesMenu;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSectionInternalization(SectionInternalization sectionInternalization) {
        this.sectionInternalization = sectionInternalization;
    }

    public void setDishesMenu(Set<DishesMenu> dishesMenu) {
        this.dishesMenu = dishesMenu;
    }

    @Override
    public String toString() {
        String dishesMenuStr = ", \"DishesMenu\": [";
        for (DishesMenu dishesMenu : getDishesMenu()){
            dishesMenuStr += dishesMenu + ",";
        }
        String comma = dishesMenuStr.substring(dishesMenuStr.length() - 1);
        if(comma.equals(",")){
            dishesMenuStr = dishesMenuStr.substring(0, dishesMenuStr.length() - 1);
        }
        dishesMenuStr += "]";

        return "{"
                + "\"id\": " + id
                + ", \"SectionInternalization\": " + sectionInternalization
                + dishesMenuStr
                + "}";
    }
}
