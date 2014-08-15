package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by Maksim_Shurpo on 8/4/2014.
 */
@Entity
@Table(name = DBConstant.Tables.places)
public class Place implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.PlacesColumns.name, nullable = false)
    private String name;

    @Column(name = DBConstant.PlacesColumns.description)
    private String description;

    @Column(name = DBConstant.PlacesColumns.geoLocal)
    private String geoLocal;

    @OneToOne
    @JoinColumn(name = DBConstant.PlacesColumns.idMenu, nullable = false)
    private Menu menu;

    @OneToMany
    @JoinColumn(name = DBConstant.UsersColumns.idPlaces, nullable = false)
    private Set<User> users;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeoLocal() {
        return geoLocal;
    }

    public void setGeoLocal(String geoLocal) {
        this.geoLocal = geoLocal;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        String users = ", \"Users\": [";
        for (User user: getUsers()){
            users += user + ",";
        }
        String comma = users.substring(users.length() - 1);
        if(comma.equals(",")){
            users = users.substring(0, users.length() - 1);
        }
        users += "]";
        return "{"
                + "\"id\": " + id
                + ", \"name\": " + "\"" + name + "\""
                + ", \"description\": " + "\"" + description + "\""
                + ", \"geoLocal\": " + "\"" + geoLocal + "\""
                + ", \"Menu\":" + menu
                + users
                + "}";
    }
}
