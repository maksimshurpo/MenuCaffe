package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim_Shurpo on 8/4/2014.
 */
@Entity
@Table(name = DBConstant.Tables.sectionInternalization)
public class SectionInternalization implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.SectionInternalizationColumns.name, nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = DBConstant.SectionInternalizationColumns.idLanguage, nullable = false)
    private Language language;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
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

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{"
                + "\"id\": " + id
                + ", \"name\": " + "\"" + name + "\""
                + ", \"Language\": " + language
                + "}";
    }
}
