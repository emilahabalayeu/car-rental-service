package com.solvd.carrental.base;

import java.math.BigDecimal;

public abstract class BaseBooking {

    private int rentalDays;
    private BigDecimal rentalPrice;

    public BaseBooking(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }
}
