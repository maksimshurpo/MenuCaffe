package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim_Shurpo on 7/28/2014.
 */
@Entity
@Table(name = DBConstant.Tables.languages)
public class Language implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.LanguagesColumns.name, nullable = false)
    private String name;

    @Column(name = DBConstant.LanguagesColumns.shortName, nullable = false)
    private String shortName;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    @Override
    public String toString() {
        return "{\"id\": " + id
                + ", \"name\": " + "\"" + name + "\""
                + ", \"shortName\": " + "\"" + shortName + "\""
                + "}";
    }
}
