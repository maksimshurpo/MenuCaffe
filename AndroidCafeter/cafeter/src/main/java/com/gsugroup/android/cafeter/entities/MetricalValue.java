package com.gsugroup.android.cafeter.entities;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class MetricalValue implements Parcelable {

    private int id;

    private String name;

    private String shortName;

    public static final Creator<MetricalValue> CREATOR = new Creator<MetricalValue>() {
        @Override
        public MetricalValue createFromParcel(Parcel source) {
            MetricalValue metricalValue = new MetricalValue();
            metricalValue.setId(source.readInt());
            metricalValue.setName(source.readString());
            metricalValue.setShortName(source.readString());
            return metricalValue;
        }

        @Override
        public MetricalValue[] newArray(int size) {
            return new MetricalValue[size];
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
