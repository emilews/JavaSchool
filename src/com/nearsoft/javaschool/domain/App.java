package com.nearsoft.javaschool.domain;

import com.nearsoft.javaschool.enums.CarType;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pruiz on 9/21/17.
 */
public class App {

    public static void main(String[] args) throws InterruptedException {

        ParkingLot parkingLot = new ParkingLot("Java School", 3);

        System.out.println("Total of available spots: " + parkingLot.getFreeSpots());

        //creates vehicles
        List<Vehicle> cars = new ArrayList<>();
        cars.add(new Car());
        cars.add(new Car(CarType.SUV));
        cars.add(new Motorcycle());
        cars.add(new Car());

        for (Vehicle car : cars) {

            System.out.println("Total of available spots: " + parkingLot.getFreeSpots());
            if (parkingLot.park(car)) {
                System.out.println("The car: " + car.getPlates() + " was parked successfully.");
            } else {
                System.out.println("There is no empty space to park.");
            }
        }

        for (Vehicle car : cars) {

            System.out.println("Total of available spots: " + parkingLot.getFreeSpots());
            double fare = parkingLot.clearSpot(car);
            if (fare > 0) {
                System.out.println("Total fare: " + fare);
                System.out.println("The car: " + car.getPlates() + " was unparked successfully.");
            } else {
                System.out.println("The car was not founded.");
            }
        }

        System.out.println("Total of available spots: " + parkingLot.getFreeSpots());

    }

}
