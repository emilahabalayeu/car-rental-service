package com.solvd.carrental.base;

import com.solvd.carrental.enums.VehicleType;
import com.solvd.carrental.exception.VehicleNotAvailableException;
import com.solvd.carrental.vehicle.Engine;
import com.solvd.carrental.vehicle.Insurance;
import com.solvd.carrental.interfaces.Describable;
import com.solvd.carrental.interfaces.Insurable;
import com.solvd.carrental.interfaces.Rentable;
import java.util.Objects;

public abstract class Vehicle implements Rentable, Insurable, Describable {

    private String type;
    private String brand;
    private boolean isAvailable;
    private Engine engine;
    private Insurance insurance;
    private VehicleType vehicleType;

    public Vehicle(String type, String brand, Engine engine, VehicleType vehicleType) {
        this.type = type;
        this.brand = brand;
        this.engine = engine;
        this.vehicleType = vehicleType;
    }

    @Override
    public void rent() {
        if (!isAvailable) {
            throw new VehicleNotAvailableException("Vehicle " + getBrand() + " is not available!");
        }
        isAvailable = false;
        System.out.println(getBrand() + " is now rented.");
    }

    @Override
    public void insure() {
        System.out.println(getBrand() + " is now insured.");
    }

    public abstract String getDescription();

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return Objects.equals(type, vehicle.type) && Objects.equals(brand, vehicle.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, brand);
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public VehicleType getVehicleType() { return vehicleType; }

    public boolean isAvailable() {
        return isAvailable;
    }

    public Engine getEngine() {
        return engine;
    }

    public Insurance getInsurance() {
        return insurance;
    }
}
