package base;

import interfaces.Describable;
import interfaces.Insurable;
import interfaces.Rentable;
import vehicle.Engine;
import vehicle.Insurance;

public abstract class Vehicle implements Rentable, Insurable, Describable {

    private String type;
    private String brand;
    private boolean isAvailable;
    private Engine engine;
    private Insurance insurance;

    public Vehicle(String type, String brand, Engine engine) {
        this.type = type;
        this.brand = brand;
        this.engine = engine;
    }

    public abstract String getDescription();

    @Override
    public void rent() {
        isAvailable = false;
        System.out.println(getBrand() + " is now rented.");
    }

    @Override
    public void insure() {
        System.out.println(getBrand() + " is now insured.");
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
