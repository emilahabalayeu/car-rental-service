package com.solvd.carrental.vehicle;

import com.solvd.carrental.base.Vehicle;
import com.solvd.carrental.enums.VehicleType;

public class Truck extends Vehicle {

    public Truck(String type, String brand, Engine engine, VehicleType truck) {
        super(type, brand, engine, truck);
    }

    @Override
    public String getDescription() {
        return "Truck: " + getBrand() + ", Type: " + getType();
    }
}
