package com.gsugroup.webcafeter.helper;

/**
 * Created by Maksim on 07.07.2014.
 */
public class DBConstant {

    public interface Tables {
        String devices = "DEVICES";
        String orders = "ORDERS";
        String sectionMenu = "SECTION_MENU";
        String menu = "MENU";
        String dishesMenu = "DISHES_MENU";
        String metricalValues = "METRICAL_VALUES";
        String ingredients = "INGREDIENTS";
        String users = "USERS";
        String roles = "ROLES";
        String languages = "LANGUAGES";
        String contents = "CONTENTS";
        String dishesInternalization = "DISHES_INTERNALIZATION";
        String sectionInternalization = "SECTION_INTERNALIZATION";
        String places = "PLACES";
        String contentInternalization = "CONTENT_INTERNALIZATION";
    }

    public interface BaseColumns{
        String id = "ID";
    }

    public interface DevicesColumns{
        String numberDev = "NUMBER_DEV";
        String name = "NAME";
    }

    public interface OrdersColumns{
        String timeStamp = "TIME_STAMP";
        String numberOrder = "NUMBER_ORDER";
        String idDishesMenu = "ID_DISHES_MENU";
        String idDevices = "ID_DEVICES";
    }

    public interface SectionMenuColumns{
        String idMenu = "ID_MENU";
        String idSectionInternalization = "ID_SECTION_INTERNALIZATION";
    }

    public interface RoleColumns{
        String name = "NAME";
        String priority = "PRIORITY";
    }

    public interface MetricalValuesColumns{
        String name = "NAME";
        String shortName = "SHORT_NAME";
    }

    public interface IngredientsColumns{
        String name = "NAME";
    }

    public interface DishesMenuColumns{
        String cost = "COST";
        String cookingTime = "COOKING_TIME";
        String idDishesInternalization = "ID_DISHES_INTERNALIZATION";
        String idSectionMenu = "ID_SECTION_MENU";
    }

    public interface UsersColumns{
        String firstName = "FIRST_NAME";
        String lastName = "LAST_NAME";
        String emailAddress = "EMAIL_ADDRESS";
        String password = "PASSWORD";
        String idRoles = "ID_ROLES";
        String idPlaces = "ID_PLACES";
    }

    public interface LanguagesColumns{
        String name = "NAME";
        String shortName = "SHORT_NAME";
    }

    public interface ContentsColumns{
        String quantity = "QUANTITY";
        String idIngredient = "ID_INGREDIENT";
        String idMetricalValue = "ID_METRICAL_VALUE";
        String idDishesMenu = "ID_DISHES_MENU";
        String idContentInternalization = "ID_CONTENT_INTERNALIZATION";
    }

    public interface DishesInternalizationColumns{
        String name = "NAME";
        String description = "DESCRIPTION";
        String idLanguage = "ID_LANGUAGE";
    }

    public interface SectionInternalizationColumns{
        String name = "NAME";
        String idLanguage = "ID_LANGUAGE";
    }

    public interface ContentInternalizationColumns{
        String idLanguage = "ID_LANGUAGE";
    }

    public interface PlacesColumns{
        String name = "NAME";
        String description = "DESCRIPTION";
        String geoLocal = "GEO_LOCAL";
        String idMenu = "ID_MENU";
    }

    public interface MenuColumns{
        String name = "NAME";
    }
}
