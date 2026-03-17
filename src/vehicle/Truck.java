package vehicle;

import base.Vehicle;

public class Truck extends Vehicle {

    public Truck(String type, String brand, Engine engine) {
        super(type, brand, engine);
    }

    @Override
    public String getDescription() {
        return "Truck: " + getBrand() + ", Type: " + getType();
    }
}
