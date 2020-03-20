package com.company;

public class PresidentHotelRoom extends HotelRoom {
    private short numberOfToilets;
    private String view;
    private boolean isBarAvailable;

    public short getNumberOfToilets() {
        return numberOfToilets;
    }

    public void setNumberOfToilets(short numberOfToilets) {
        this.numberOfToilets = numberOfToilets;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public boolean isBarAvailable() {
        return isBarAvailable;
    }

    public void setBarAvailable(boolean barAvailable) {
        isBarAvailable = barAvailable;
    }

    public PresidentHotelRoom(short numberOfBeds, short numberOfRoom, String nameOfGuest, int cost) {
        super(numberOfBeds, numberOfRoom, nameOfGuest, cost);
    }

    public PresidentHotelRoom() {
    }

    @Override
    public String toString() {
        return "Количество спальных мест:" + this.getNumberOfBeds() + ", номер комнаты:" + this.getNumberOfRoom() + ", имя постояльца:" + this.getNameOfGuest() + ", стоимость:" + this.getCost() + ", количество санузлов:" + this.numberOfToilets + ", вид из окна:" + this.view + ", доступность бара:" + this.isBarAvailable;
    }

}
