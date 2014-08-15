package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class DishesInternalization implements Parcelable {

    private int id;

    private String name;

    private String description;

    private Language language;

    public static final Creator<DishesInternalization> CREATOR = new Creator<DishesInternalization>() {
        @Override
        public DishesInternalization createFromParcel(Parcel source) {
            DishesInternalization dishesInternalization = new DishesInternalization();
            dishesInternalization.setId(source.readInt());
            dishesInternalization.setName(source.readString());
            dishesInternalization.setDescription(source.readString());
            dishesInternalization.setLanguage((Language) source.readParcelable(Language.class.getClassLoader()));
            return dishesInternalization;
        }

        @Override
        public DishesInternalization[] newArray(int size) {
            return new DishesInternalization[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
        dest.writeString(description);
        dest.writeParcelable(language, flags);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }
}
