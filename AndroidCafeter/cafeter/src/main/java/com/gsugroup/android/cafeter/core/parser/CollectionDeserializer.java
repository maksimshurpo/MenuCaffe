package com.gsugroup.android.cafeter.core.parser;

import com.google.gson.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class CollectionDeserializer implements JsonDeserializer<Collection<?>> {

    @Override
    public Collection<?> deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        Type realType = ((ParameterizedType)type).getActualTypeArguments()[0];
        return parseAsArrayList(jsonElement, realType);
    }

    public <T> ArrayList<T> parseAsArrayList(JsonElement json, T type){
        ArrayList<T> newArray = new ArrayList<T>();
        Gson gson = new Gson();

        JsonArray array = json.getAsJsonArray();
        Iterator<JsonElement> iterator = array.iterator();
        while (iterator.hasNext()){
            JsonElement json2 = (JsonElement) iterator.next();
            T object = (T) gson.fromJson(json2, (Class<T>)type);
            newArray.add(object);
        }
        return newArray;
    }
}
