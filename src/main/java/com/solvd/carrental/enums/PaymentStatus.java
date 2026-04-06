package com.solvd.carrental.enums;

public enum PaymentStatus {

    PAID("Paid", true),
    UNPAID("Unpaid", false),
    REFUNDED("Refunded", false);

    private final String displayName;
    private final boolean isCompleted;

    PaymentStatus(String displayName, boolean isCompleted) {
        this.displayName = displayName;
        this.isCompleted = isCompleted;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public String describe() {
        return "Payment is " + displayName + (isCompleted ? " and completed" : " and not completed");
    }
}