package com.company;

public class Popcorn implements VendingMachine {

    private String brandName;
    private String Manufacturer;

    public Popcorn(){};

    public Popcorn(String brandName, String manufacturer) {
        this.brandName = brandName;
        Manufacturer = manufacturer;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    @Override
    public void buy() {

    }

    @Override
    public void complainItDidNotDrop() {

    }


    @Override
    public String toString() {
        return "Popcorn{" +
                "brandName='" + brandName + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                '}';
    }
}
