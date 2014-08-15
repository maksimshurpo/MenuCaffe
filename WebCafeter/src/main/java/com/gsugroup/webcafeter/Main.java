package com.gsugroup.webcafeter;

import com.gsugroup.webcafeter.model.entity.Place;
import com.gsugroup.webcafeter.model.service.PlaceService;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by Maksim on 07.07.2014.
 */
public class Main {

    public static void main(String[] args){
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("/WEB-INF/spring/root-context.xml");
        ctx.refresh();
        PlaceService deviceService = ctx.getBean("placeService", PlaceService.class);
        for(Place device : deviceService.getPlacesLong(0, 10, "ASC", "id")){
            System.out.println(device);
        }

    }
}
