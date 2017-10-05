package com.nearsoft.javaschool.domain;

public abstract class Vehicle {

    private String plates;

    private int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) {
        this.plates = plates;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public abstract float getHourPrice();

}