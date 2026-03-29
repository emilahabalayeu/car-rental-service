package enums;

public enum ClientType {

    INDIVIDUAL("Individual Client", 10),
    COMPANY("Company Client", 20);

    private final String displayName;
    private final int discountPercent;

    ClientType(String displayName, int discountPercent) {
        this.displayName = displayName;
        this.discountPercent = discountPercent;
    }

    public String getDisplayName() {
        return displayName;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public String describe() {
        return displayName + " gets " + discountPercent + "% discount";
    }
}