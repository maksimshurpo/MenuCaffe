package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim_Shurpo on 8/4/2014.
 */
@Entity
@Table(name = DBConstant.Tables.dishesInternalization)
public class DishesInternalization implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.DishesInternalizationColumns.name, nullable = false)
    private String name;

    @Column(name = DBConstant.DishesInternalizationColumns.description)
    private String description;

    @OneToOne
    @JoinColumn(name = DBConstant.DishesInternalizationColumns.idLanguage, nullable = false)
    private Language language;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Language getLanguage() {
        return language;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\": " + id
                + ", \"name\": " + "\"" + name + "\""
                + ", \"description\": " + "\"" + description + "\""
                + ", \"Language\" : " + language
                + "}";
    }
}
