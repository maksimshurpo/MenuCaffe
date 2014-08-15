package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class Content implements Parcelable{

    private int id;

    private int quantity;

    private Ingredient ingredient;

    private MetricalValue metricalValue;

    private ContentInternalization contentInternalization;

    public static final Creator<Content> CREATOR = new Creator<Content>() {
        @Override
        public Content createFromParcel(Parcel source) {
            Content content = new Content();
            content.setId(source.readInt());
            content.setQuantity(source.readInt());
            content.setIngredient((Ingredient)source.readParcelable(Ingredient.class.getClassLoader()));
            content.setMetricalValue((MetricalValue)source.readParcelable(MetricalValue.class.getClassLoader()));
            content.setContentInternalization((ContentInternalization)source.readParcelable(ContentInternalization.class.getClassLoader()));
            return content;
        }

        @Override
        public Content[] newArray(int size) {
            return new Content[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(quantity);
        dest.writeParcelable(ingredient, flags);
        dest.writeParcelable(contentInternalization, flags);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public MetricalValue getMetricalValue() {
        return metricalValue;
    }

    public void setMetricalValue(MetricalValue metricalValue) {
        this.metricalValue = metricalValue;
    }

    public ContentInternalization getContentInternalization() {
        return contentInternalization;
    }

    public void setContentInternalization(ContentInternalization contentInternalization) {
        this.contentInternalization = contentInternalization;
    }
}
