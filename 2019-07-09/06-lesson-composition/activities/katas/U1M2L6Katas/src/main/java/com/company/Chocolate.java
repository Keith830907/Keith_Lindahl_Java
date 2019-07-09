package com.company;

public class Chocolate implements  Store, VendingMachine {

    private String brandName;
    private String manufacturer;

    public Chocolate(){};

    public Chocolate(String brandName, String manufacturer) {
        this.brandName = brandName;
        this.manufacturer = manufacturer;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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
        return "Chocolate{" +
                "brandName='" + brandName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
