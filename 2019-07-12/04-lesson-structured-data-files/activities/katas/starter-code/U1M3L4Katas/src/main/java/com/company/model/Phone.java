package com.company.model;

public class Phone {

    private String brand;
    private String model;
    private String processor;
    private String storage;
    private String price;

    public Phone() {
    }

    public Phone(String brand, String model, String processor, String storage, String price) {
        this.brand = brand;
        this.model = model;
        this.processor = processor;
        this.storage = storage;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor='" + processor + '\'' +
                ", storage='" + storage + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
