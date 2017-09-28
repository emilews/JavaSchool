package com.nearsoft.javaschool.domain.Vehicles;

import com.nearsoft.javaschool.enums.VehicleType;

public class VehicleFactory {

    public static Vehicle getVehicle(VehicleType vehicleType) {
        return getVehicle(vehicleType, null);
    }

    public static Vehicle getVehicle(VehicleType vehicleType, String plates) {
        switch (vehicleType) {
            case SEDAN:
                return new Car(vehicleType, plates);
            case SUV:
                return new Car(vehicleType, plates);
            case MOTORCYCLE:
                return new Motorcycle();
            default:
                return new Car();
        }
    }
}
