package enums;

public enum VehicleType {

    CAR("Passenger Car", 4),
    TRUCK("Cargo Truck", 2),
    MOTORCYCLE("Motorcycle", 2),
    SCOOTER("Scooter", 2),
    MINIBUS("Minibus", 8);

    private final String displayName;
    private final int numberOfWheels;

    VehicleType(String displayName, int numberOfWheels) {
        this.displayName = displayName;
        this.numberOfWheels = numberOfWheels;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String describe() {
        return displayName + " with " + numberOfWheels + " wheels";
    }
}