package com.solvd.carrental.vehicle;

import com.solvd.carrental.base.Vehicle;
import com.solvd.carrental.enums.VehicleType;

public class Car extends Vehicle {

    public Car(String type, String brand, Engine engine, VehicleType vehicleType) {
        super(type, brand, engine, vehicleType);
    }

    @Override
    public String getDescription() {
        return "Car: " + getBrand() + ", type: " + getType();
    }

    @Override
    public String toString() {
        return "Car: " + getBrand() + ", type: " + getType();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
