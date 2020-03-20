package com.company;

public class FamilyHotelRoom extends HotelRoom {
    private short numberOfChildrenBeds;
    private String typeOfToys;

    public short getNumberOfChildrenBeds() {
        return numberOfChildrenBeds;
    }

    public void setNumberOfChildrenBeds(short numberOfChildrenBeds) {
        this.numberOfChildrenBeds = numberOfChildrenBeds;
    }

    public String getTypeOfToys() {
        return typeOfToys;
    }

    public void setTypeOfToys(String typeOfToys) {
        this.typeOfToys = typeOfToys;
    }

    public FamilyHotelRoom(short numberOfBeds, short numberOfRoom, String nameOfGuest, int cost) {
        super(numberOfBeds, numberOfRoom, nameOfGuest, cost);
    }

    public FamilyHotelRoom() {
    }

    @Override
    public String toString() {
        return "Количество спальных мест:" + this.getNumberOfBeds() + ", номер комнаты:" + this.getNumberOfRoom() + ", имя постояльца:" + this.getNameOfGuest() + ", стоимость:" + this.getCost() + ", количество детских спальных мест:" + this.numberOfChildrenBeds + ", какие игрушки доступны ребёнку:" + this.typeOfToys;
    }
}
