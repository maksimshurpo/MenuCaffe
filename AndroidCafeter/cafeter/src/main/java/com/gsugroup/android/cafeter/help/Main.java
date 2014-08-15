package com.gsugroup.android.cafeter.help;

import android.content.Context;
import android.content.pm.PackageManager;

import com.google.gson.reflect.TypeToken;
import com.gsugroup.android.cafeter.entities.*;
import com.gsugroup.android.cafeter.core.parser.ParserJson;

import java.util.List;

/**
 * Created by Maksim_Shurpo on 8/7/2014.
 */
public class Main {

    private static final String json =
            "        {\n" +
            "            \"id\": 1,\n" +
            "            \"timestamp\": \"2014-07-21\",\n" +
            "            \"numberOrder\": 1,\n" +
            "            \"dishesMenu\": {\n" +
            "                \"id\": 1,\n" +
            "                \"cost\": 12.3,\n" +
            "                \"cookingTime\": 10,\n" +
            "                \"dishesInternalization\": {\n" +
            "                    \"id\": 1,\n" +
            "                    \"name\": \"Цезарь\",\n" +
            "                    \"description\": \"вкусный салат\",\n" +
            "                    \"language\": {\n" +
            "                        \"id\": 1,\n" +
            "                        \"name\": \"Russian\",\n" +
            "                        \"shortName\": \"RU_RU\"\n" +
            "                    }\n" +
            "                },\n" +
            "                \"contents\": [\n" +
            "                    {\n" +
            "                        \"id\": 4,\n" +
            "                        \"quantity\": 120,\n" +
            "                        \"ingredient\": {\n" +
            "                            \"id\": 2,\n" +
            "                            \"name\": \"морковка\"\n" +
            "                        },\n" +
            "                        \"metricalValue\": {\n" +
            "                            \"id\": 3,\n" +
            "                            \"name\": \"грамм\",\n" +
            "                            \"shortName\": \"гр\"\n" +
            "                        },\n" +
            "                        \"contentInternalization\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"language\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"name\": \"Russian\",\n" +
            "                                \"shortName\": \"RU_RU\"\n" +
            "                            }\n" +
            "                        }\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": 5,\n" +
            "                        \"quantity\": 120,\n" +
            "                        \"ingredient\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"name\": \"капуста\"\n" +
            "                        },\n" +
            "                        \"metricalValue\": {\n" +
            "                            \"id\": 3,\n" +
            "                            \"name\": \"грамм\",\n" +
            "                            \"shortName\": \"гр\"\n" +
            "                        },\n" +
            "                        \"contentInternalization\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"language\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"name\": \"Russian\",\n" +
            "                                \"shortName\": \"RU_RU\"\n" +
            "                            }\n" +
            "                        }\n" +
            "                    },\n" +
            "                    {\n" +
            "                        \"id\": 6,\n" +
            "                        \"quantity\": 90,\n" +
            "                        \"ingredient\": {\n" +
            "                            \"id\": 4,\n" +
            "                            \"name\": \"лук\"\n" +
            "                        },\n" +
            "                        \"metricalValue\": {\n" +
            "                            \"id\": 3,\n" +
            "                            \"name\": \"грамм\",\n" +
            "                            \"shortName\": \"гр\"\n" +
            "                        },\n" +
            "                        \"contentInternalization\": {\n" +
            "                            \"id\": 1,\n" +
            "                            \"language\": {\n" +
            "                                \"id\": 1,\n" +
            "                                \"name\": \"Russian\",\n" +
            "                                \"shortName\": \"RU_RU\"\n" +
            "                            }\n" +
            "                        }\n" +
            "                    }\n" +
            "                ]\n" +
            "            }\n" +
            "        }\n";

    public static final void main(String[] args){

        ParserJson parserJson = new ParserJson();
        Order order = parserJson.parseAsObject(json, Order.class);

        List<Device> lists = parserJson.parseAsList(HelpJson.devices, new TypeToken<List<Device>>(){}.getType());

        String result = parserJson.toJson(lists);
        System.out.println("id = ");
    }

    public int div(int a, int b){
        return a / b;
    }

    public boolean checkLocationPermission(Context context) {
        String permission = "android.permission.ACCESS_FINE_LOCATION";
        int res = context.checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }
}
