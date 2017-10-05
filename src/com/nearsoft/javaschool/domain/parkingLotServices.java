package com.nearsoft.javaschool.domain;

import java.time.Duration;
import java.time.LocalDateTime;

public class parkingLotServices extends ParkingLot {

    public parkingLotServices(String name, int numberOfSpots) {
        super(name, numberOfSpots);
    }

    public static int getFreeSpots(ParkingLot p) {
        int freeSpots = 0;
        for (Spot spot : p.getSpots()) {
            if (spot.isAvailable()) {
                freeSpots++;
            }
        }
        return freeSpots;
    }
    public static boolean park(Vehicle car, ParkingLot p) {

        if (getFreeSpots(p) > 0) {
            for (int i = 0; i < p.getSpots().length; i++) {
                if (p.getSpots()[i].isAvailable()) {
                    p.getSpots()[i].setCar(car);
                    break;
                }
            }
            return true;
        } else {
            return false;
        }

    }
    public static double clearSpot(Vehicle vehicle, ParkingLot p) {
        double fare = 0.0;
        for (int i = 0; i < p.getSpots().length; i++) {
            if (p.getSpots()[i].getCar() == null)
                continue;

            if (p.getSpots()[i].getCar().equals(vehicle)) {

                double diff = Math.ceil(Duration.between(p.getSpots()[i].getArrivalTime(), LocalDateTime.now()).toMinutes() / 60);

                fare = p.getSpots()[i].getCar().getHourPrice() * diff;

                p.getSpots()[i].setCar(null);

                return fare;
            }
        }
        return fare;
    }
}
