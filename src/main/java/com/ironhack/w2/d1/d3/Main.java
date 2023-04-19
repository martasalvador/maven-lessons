package com.ironhack.w2.d1.d3;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        //// ENUMS
        User marta = new User("Marta");
        User silvia = new User("Silvia");
        System.out.println(marta);
        System.out.println(silvia);

        Category category = Category.GOLD;
        System.out.println("Category: " + category + " Points: " + category.POINTS);


        //// HASH MAPS

        // HASH MAP de Strings
        Map<String, String> nationalLeaders = new HashMap<>();

        nationalLeaders.put("India", "Ram Natch Kovind");
        nationalLeaders.put("Japan", "Shinzō Abe");
        nationalLeaders.put("Ecuador", "Lenín Moreno");
        nationalLeaders.put("Botswana", "Mokgweetsi Masisi");

        System.out.println(nationalLeaders);

        nationalLeaders.forEach((key, value) -> {
            System.out.println("Key: " + key + " value:" + value);
        });

        System.out.println(nationalLeaders.keySet());  // devuelve solo las claves del mapa

        // HASH MAP de String y Objeto
        Map<String, Country> countries = new HashMap<>();

        Country india = new Country("India", "New Delhi", 1387297452, "Ram Nath Kovind");
        Country botswana = new Country("Botswana", "Gaborone", 2351627, "Mokgweetsi Masisi");
        Country japan = new Country("Japan", "Tokyo", 126476461, "Shinzō Abe");
        countries.put(india.getCountryName(), india);
        countries.put(botswana.getCountryName(), botswana);
        countries.put(japan.getCountryName(), japan);

        System.out.println(countries);
        System.out.println(countries.get("Japan"));
        System.out.println(countries.get("India").getCapital());

    }
}
