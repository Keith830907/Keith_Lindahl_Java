package com.company;

public class SodaPop implements Store, VendingMachine, Restaurant {

    private String brandName;
    private String manufacturer;

    public SodaPop(){};

    public SodaPop(String brandName, String manufacturer) {
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
    public void order() {

    }

    @Override
    public void thankWaitress() {

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
        return "SodaPop{" +
                "brandName='" + brandName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }
}
