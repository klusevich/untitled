package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Converter {
    public static HotelRoom JSONtoPOJO (String json) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.fromJson(json, HotelRoom.class);
    }
}
