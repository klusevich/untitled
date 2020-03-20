package com.company;

public class LuxHotelRoom extends HotelRoom{
    private boolean isSafeAvailable;

    public boolean isSafeAvailable() {
        return isSafeAvailable;
    }

    public void setSafeAvailable(boolean safeAvailable) {
        isSafeAvailable = safeAvailable;
    }

    public LuxHotelRoom(short numberOfBeds, short numberOfRoom, String nameOfGuest, int cost) {
        super(numberOfBeds, numberOfRoom, nameOfGuest, cost);
    }

    public LuxHotelRoom() {
    }

    @Override
    public String toString() {
        return "Количество спальных мест:" + this.getNumberOfBeds() + ", номер комнаты:" + this.getNumberOfRoom() + ", имя постояльца:" + this.getNameOfGuest() + ", стоимость:" + this.getCost() + ", наличие сейфа:" + this.isSafeAvailable;
    }
}
