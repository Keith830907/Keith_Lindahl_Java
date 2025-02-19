package com.company;
public class Car {

    private String make;
    private String model;
    private String type;
    private String color;
    private String engine;
    private String transmission;
    private int numDoors;
    private double Mpg;
    private int milesDriven;


    public Car(String make, String model, String type, String color, String engine, String transmission, int numDoors, double mpg, int milesDriven) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.numDoors = numDoors;
        this.Mpg = mpg;
        this.milesDriven = milesDriven;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void setMpg(double Mpg) {
        this.Mpg = Mpg;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public double getMpg() {
        return Mpg;
    }

    public int getMilesDriven() {
        return milesDriven;
    }
}
