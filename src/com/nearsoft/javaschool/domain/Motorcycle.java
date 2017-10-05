package com.nearsoft.javaschool.domain;

public class Motorcycle extends Vehicle {

    public Motorcycle() {
        super(2);
    }

    @Override
    public float getHourPrice() {
        return 10;
    }
}
