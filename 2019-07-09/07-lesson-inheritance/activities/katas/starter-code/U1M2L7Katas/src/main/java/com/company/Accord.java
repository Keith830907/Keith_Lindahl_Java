package com.company;

public class Accord extends Sedan {

    public Accord(){};

    public Accord(String year, Engine engine, Transmission transmission) {
        this.year = year;
        this.engine = engine;
        this.transmission = transmission;
    }

    private String year;
    private Engine engine;
    private Transmission transmission;

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }


}
