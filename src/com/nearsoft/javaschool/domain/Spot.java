package com.nearsoft.javaschool.domain;

import java.time.LocalDateTime;

public class Spot {

    //attributes
    LocalDateTime arrivalTime;
    private int id;
    private Vehicle car;

    public Spot(int id) {
        this.id = id;
        //this.arrivalTime = LocalDateTime.now();
        this.arrivalTime = LocalDateTime.now().minusHours(2);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public boolean isAvailable() {
        return getCar() == null;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
