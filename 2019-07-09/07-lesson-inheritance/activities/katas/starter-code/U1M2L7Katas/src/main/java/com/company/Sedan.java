package com.company;

public class Sedan extends Car {

    public Sedan(){};

    public Sedan(int numDoors, boolean poweredWindows) {
        this.numDoors = numDoors;
        this.poweredWindows = poweredWindows;
    }

    private int numDoors;
    private boolean poweredWindows;

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public boolean isPoweredWindows() {
        return poweredWindows;
    }

    public void setPoweredWindows(boolean poweredWindows) {
        this.poweredWindows = poweredWindows;
    }
}
