package com.example.ryan.cityofstarkville;

public class Place {
    private String nameOfPlace;
    private String addressOfPlace;
    private int pictureOfPlace;
    private String descriptionOfPlace;

    public Place(String name, String address, int pictureResourceID, String description) {
        nameOfPlace = name;
        addressOfPlace = address;
        pictureOfPlace = pictureResourceID;
        descriptionOfPlace = description;


    }

    public String getPlaceName() {
        return nameOfPlace;
    }

    public String getAddressOfPlace() {
        return R.string.addressLabel + addressOfPlace;
    }

    public String getDescriptionOfPlace() {
        return descriptionOfPlace;
    }

    public int getPictureOfPlace() {
        return pictureOfPlace;
    }
}
