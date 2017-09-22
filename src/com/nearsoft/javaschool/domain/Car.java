package com.nearsoft.javaschool.domain;

import com.nearsoft.javaschool.enums.CarType;

/**
 * Created by pruiz on 9/21/17.
 */
public class Car extends Vehicle {

    private CarType type = CarType.SEDAN;

    public Car() {
        super(4);
    }

    public Car(CarType type) {
        super(4);
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Car car = (Car) o;

        if (getPlates() != null ? !getPlates().equals(car.getPlates()) : car.getPlates() != null)
            return false;
        return type == car.type;
    }

    @Override
    public int hashCode() {
        int result = getPlates() != null ? getPlates().hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    @Override
    public float getHourPrice() {
        switch (type) {
            case SEDAN:
                return 12;
            default:
                return 15;
        }

    }
}
