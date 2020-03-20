package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SearchClass {
    private Map<Integer, HotelRoom> roomMap = new HashMap<>();
    private WorkingWithFile workingWithFile = new WorkingWithFile();

    public void createRoomMap () throws IOException {
        workingWithFile.readFromFileByLines();
        for (String json : workingWithFile.getLinesAsArray()){
            HotelRoom hotelRoom = Converter.JSONtoPOJO(json);
            roomMap.put(hotelRoom.getNumberOfRoom(), hotelRoom);
        }
    }

    public Map<Integer, HotelRoom> getRoomMap() {
        return roomMap;
    }
}
