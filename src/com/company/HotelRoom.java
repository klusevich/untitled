package com.company;

import com.google.gson.annotations.SerializedName;

public class HotelRoom {
    @SerializedName("numberOfBeds")
    private int numberOfBeds;
    @SerializedName("numberOfRoom")
    private int numberOfRoom;
    @SerializedName("nameOfGuest")
    private String nameOfGuest;
    @SerializedName("cost")
    private int cost;

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public String getNameOfGuest() {
        return nameOfGuest;
    }

    public void setNameOfGuest(String nameOfGuest) {
        this.nameOfGuest = nameOfGuest;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public HotelRoom(int numberOfBeds, int numberOfRoom, String nameOfGuest, int cost) {
        this.numberOfBeds = numberOfBeds;
        this.numberOfRoom = numberOfRoom;
        this.nameOfGuest = nameOfGuest;
        this.cost = cost;
    }

    public HotelRoom() {
    }

    public String toString() {
        return "Количество спальных мест:" + this.getNumberOfBeds() + ", номер комнаты:" + this.getNumberOfRoom() + ", имя постояльца:" + this.getNameOfGuest() + ", стоимость:" + this.getCost();
    }
}
