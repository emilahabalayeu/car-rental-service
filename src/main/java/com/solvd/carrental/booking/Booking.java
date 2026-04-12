package com.solvd.carrental.booking;

import com.solvd.carrental.base.BaseBooking;
import com.solvd.carrental.client.Client;
import com.solvd.carrental.base.Vehicle;
import com.solvd.carrental.enums.BookingStatus;
import com.solvd.carrental.enums.PaymentStatus;
import com.solvd.carrental.exception.InvalidRentalDaysException;
import com.solvd.carrental.exception.PaymentFailedException;
import com.solvd.carrental.interfaces.Payable;

import java.time.LocalDate;
import java.util.Objects;
import com.solvd.carrental.annotations.RentalInfo;

@RentalInfo(description = "Main booking class", author = "Emil")
public class Booking extends BaseBooking implements Payable {

    private Client client;
    private Vehicle vehicle;
    private LocalDate bookingDate;
    private BookingStatus bookingStatus;
    private PaymentStatus paymentStatus;

    public Booking(Client client, Vehicle vehicle, int rentalDays, BookingStatus bookingStatus,  PaymentStatus paymentStatus) {
        super(rentalDays);
        if (rentalDays <= 0) {
            throw new InvalidRentalDaysException("Rental days must be greater than 0!");
        }
        this.client = client;
        this.vehicle = vehicle;
        this.bookingStatus = bookingStatus;
        this.paymentStatus = paymentStatus;
    }

    public void confirmBooking() {

        if (vehicle.isAvailable()) {
            System.out.println("Booking confirmed!"
                    + "\nClient: " + client.getFirstName() + " " + client.getLastName()
                    + "\nVehicle: " + vehicle.getBrand()
                    + "\nDays: " + getRentalDays()
                    + "\nPrice: " + getRentalPrice()
                    + "\nDate: " + bookingDate);
        } else {
            System.out.println("Vehicle is not available!");
        }
    }

    @Override
    public void pay() {
        if (getRentalPrice() == null) {
            throw new PaymentFailedException("Payment failed - rental price is not set!");
        }
        System.out.println("Payment of " + getRentalPrice() + " processed for " + client.getFirstName() + " " + client.getLastName());
    }

    @Override
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", vehicle=" + vehicle +
                ", bookingDate=" + bookingDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(client, booking.client) && Objects.equals(vehicle, booking.vehicle) && Objects.equals(bookingDate, booking.bookingDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(client, vehicle, bookingDate);
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Client getClient() {
        return client;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}
