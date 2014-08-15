package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim_Shurpo on 7/28/2014.
 */
@Entity
@Table(name = DBConstant.Tables.users)
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.UsersColumns.firstName, nullable = false)
    private String firstName;

    @Column(name = DBConstant.UsersColumns.lastName, nullable = false)
    private String lastName;

    @Column(name = DBConstant.UsersColumns.emailAddress, nullable = false)
    private String emailAddress;

    @Column(name = DBConstant.UsersColumns.password, nullable = false)
    private String password;

    @OneToOne
    @JoinColumn(name = DBConstant.UsersColumns.idRoles, nullable = false)
    private Role role;

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public Role getRole() {
        return role;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "{ \"id\": " + id
                + ", \"firstName\": " + "\"" + firstName + "\""
                + ", \"lastName\": " + "\"" + lastName + "\""
                + ", \"emailAddress\": " + "\"" + emailAddress + "\""
                + ", \"password\": " + "\"" + password + "\""
                + ", \"Role\": " + role
                + " }";
    }
}
