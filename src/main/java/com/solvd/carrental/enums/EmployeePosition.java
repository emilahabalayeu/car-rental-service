package com.solvd.carrental.enums;

public enum EmployeePosition {

    DIRECTOR("Director", 15000),
    ACCOUNTANT("Accountant", 5000),
    LAWYER("Lawyer", 6500),
    MARKETER("Marketer", 5800),
    INSURANCE_SPECIALIST("Insurance Specialist", 6500),
    CLIENT_SUPPORT("Client Support Specialist", 4500);

    private final String displayName;
    private final double baseSalary;

    EmployeePosition(String displayName, double baseSalary) {
        this.displayName = displayName;
        this.baseSalary = baseSalary;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String describe() {
        return displayName + " with com.solvd.carrental.base salary " + baseSalary;
    }
}