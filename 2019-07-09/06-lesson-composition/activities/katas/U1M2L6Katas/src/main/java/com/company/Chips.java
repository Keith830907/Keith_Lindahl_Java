package com.company;

public class Chips implements Store, VendingMachine {

    private String brandName;
    private String Manufacturer;

    public Chips(){};

    public Chips(String brandName, String manufacturer) {
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
    public void purchase() {

    }

    @Override
    public void returnItem() {

    }

    @Override
    public void buy() {

    }

    @Override
    public void complainItDidNotDrop() {

    }


    @Override
    public String toString() {
        return "Chips{" +
                "brandName='" + brandName + '\'' +
                ", Manufacturer='" + Manufacturer + '\'' +
                '}';
    }
}
