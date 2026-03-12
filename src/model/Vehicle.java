package model;

public class Vehicle {
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
