package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim_Shurpo on 8/4/2014.
 */
@Entity
@Table(name = DBConstant.Tables.roles)
public class Role implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.RoleColumns.name, nullable = false)
    private String name;

    @Column(name = DBConstant.RoleColumns.priority, nullable = false)
    private String priority;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPriority() {
        return priority;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\": " + id
                + ", \"name\": " + "\"" + name + "\""
                + ", \"priority\": " + "\"" + priority + "\""
                + "}";
    }
}
