package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim on 09.07.2014.
 */
@Entity
@Table(name = DBConstant.Tables.metricalValues)
@Transactional
public class MetricalValue implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.MetricalValuesColumns.name, nullable = false)
    private String name;

    @Column(name = DBConstant.MetricalValuesColumns.shortName, nullable = false)
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
        String result = "{"
                + "\"id\" : " + getId()
                + ", \"name\" : " + "\"" + getName() + "\""
                + ", \"shortName\": " + "\"" + getShortName() + "\""
                + "}";
        return result;
    }
}
