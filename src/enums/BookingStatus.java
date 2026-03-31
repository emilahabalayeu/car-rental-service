package enums;

public enum BookingStatus {

    PENDING("Pending", false),
    CONFIRMED("Confirmed", true),
    CANCELLED("Cancelled", false);

    private final String displayName;
    private final boolean isActive;

    BookingStatus(String displayName, boolean isActive) {
        this.displayName = displayName;
        this.isActive = isActive;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isActive() {
        return isActive;
    }

    public String describe() {
        return "Booking is " + displayName + (isActive ? " and active" : " and inactive");
    }
}