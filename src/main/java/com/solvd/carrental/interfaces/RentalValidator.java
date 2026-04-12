package com.solvd.carrental.interfaces;

@FunctionalInterface
public interface RentalValidator<T> {
    boolean validate(T item);
}