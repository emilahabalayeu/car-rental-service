package com.solvd.carrental.interfaces;

@FunctionalInterface
public interface PriceCalculator {
    double calculate(int days, double pricePerDay);
}