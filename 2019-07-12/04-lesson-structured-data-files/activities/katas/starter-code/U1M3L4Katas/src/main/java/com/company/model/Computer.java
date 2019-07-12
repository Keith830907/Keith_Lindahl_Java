package com.company.model;

public class Computer {
    private String Brand;
    private String Model;
    private String CPU;
    private String RAM;
    private String StorageSize;

    public Computer(){};

    public Computer(String brand, String model, String CPU, String RAM, String storageSize) {
        Brand = brand;
        Model = model;
        this.CPU = CPU;
        this.RAM = RAM;
        StorageSize = storageSize;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorageSize() {
        return StorageSize;
    }

    public void setStorageSize(String storageSize) {
        StorageSize = storageSize;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "Brand='" + Brand + '\'' +
                ", Model='" + Model + '\'' +
                ", CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", StorageSize='" + StorageSize + '\'' +
                '}';
    }
}
