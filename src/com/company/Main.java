package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        SearchClass searchClass = new SearchClass();
        searchClass.createRoomMap();
        System.out.println(searchClass.getRoomMap().get(1));
    }
}
