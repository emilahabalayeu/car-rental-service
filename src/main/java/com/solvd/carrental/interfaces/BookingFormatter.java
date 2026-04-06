package com.solvd.carrental.interfaces;

@FunctionalInterface
public interface BookingFormatter {
    String format(String clientName, String vehicleBrand, int days);
}