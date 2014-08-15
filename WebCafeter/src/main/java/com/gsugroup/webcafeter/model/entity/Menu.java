package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Maksim_Shurpo on 7/29/2014.
 */
@Entity
@Table(name = DBConstant.Tables.menu)
public class Menu implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.MenuColumns.name)
    private String name;

    @OneToMany
    @JoinColumn(name = DBConstant.SectionMenuColumns.idMenu, nullable = false)
    private Set<SectionMenu> sectionsMenu;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<SectionMenu> getSectionsMenu() {
        return sectionsMenu;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSectionsMenu(Set<SectionMenu> sectionsMenu) {
        this.sectionsMenu = sectionsMenu;
    }

    @Override
    public String toString() {
        String result = ", \"SectionMenu\" : [";
        for (SectionMenu s : sectionsMenu){
            result += s + ",";
        }
        String comma = result.substring(result.length() - 1);
        if(comma.equals(",")) {
            result = result.substring(0, result.length() - 1);
        }
        result += "]";
        return "{\"id\": " + id
                + ", \"name\": " + "\"" + name + "\""
                + result
                + "}";
    }
}
