package com.gsugroup.android.cafeter.core.parser;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class ParserJson {

    private Gson gson;

    public ParserJson() {
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Collection.class, new CollectionDeserializer());
        gson = builder.create();
    }

    public <T> T parseAsObject(String json, Class<T> classOfT){
        T result = (T) gson.fromJson(json, classOfT);
        return result;
    }

    public <T> List<T> parseAsList(String json, Type type){
        /*Type listOfType = new TypeToken<List<T>>(){}.getType();*/
        return gson.fromJson(json, type);
    }

    public <T> String toJson(T object){
        return gson.toJson(object);
    }

}
