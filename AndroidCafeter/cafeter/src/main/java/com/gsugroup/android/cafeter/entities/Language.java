package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class Language implements Parcelable{

    private int id;

    private String name;

    private String shortName;

    public static final Creator<Language> CREATOR = new Creator<Language>() {
        @Override
        public Language createFromParcel(Parcel source) {
            Language language = new Language();
            language.setId(source.readInt());
            language.setName(source.readString());
            language.setShortName(source.readString());
            return language;
        }

        @Override
        public Language[] newArray(int size) {
            return new Language[size];
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
        dest.writeString(shortName);
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }
}
