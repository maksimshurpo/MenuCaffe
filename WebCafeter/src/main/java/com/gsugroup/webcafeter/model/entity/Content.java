package com.gsugroup.webcafeter.model.entity;

import com.gsugroup.webcafeter.helper.DBConstant;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Maksim_Shurpo on 7/28/2014.
 */
@Entity
@Table(name = DBConstant.Tables.contents)
public class Content implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = DBConstant.BaseColumns.id, nullable = false)
    private long id;

    @Column(name = DBConstant.ContentsColumns.quantity, nullable = false)
    private int quantity;

    @OneToOne
    @JoinColumn(name = DBConstant.ContentsColumns.idIngredient, nullable = false)
    private Ingredient ingredient;

    @OneToOne
    @JoinColumn(name = DBConstant.ContentsColumns.idMetricalValue, nullable = false)
    private MetricalValue metricalValue;

    @OneToOne
    @JoinColumn(name = DBConstant.ContentsColumns.idContentInternalization, nullable = false)
    private ContentInternalization contentInternalization;

    public long getId() {
        return id;
    }

    public int getQuantity() {
        return quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public MetricalValue getMetricalValue() {
        return metricalValue;
    }

    public ContentInternalization getContentInternalization() {
        return contentInternalization;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setMetricalValue(MetricalValue metricalValue) {
        this.metricalValue = metricalValue;
    }

    public void setContentInternalization(ContentInternalization contentInternalization) {
        this.contentInternalization = contentInternalization;
    }

    @Override
    public String toString() {
        return "{ \"id\" : " + id
                + ", \"quantity\": " + quantity
                + ", \"Ingredient\": " + ingredient
                + ", \" MetricalValue\": " + metricalValue
                + ", \"ContentInternalization\": " + contentInternalization
                + "}";
    }
}
