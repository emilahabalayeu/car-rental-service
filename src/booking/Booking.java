package booking;

import base.BaseBooking;
import client.Client;
import base.Vehicle;
import interfaces.Payable;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Booking extends BaseBooking implements Payable {
    private Client client;
    private Vehicle vehicle;
    private LocalDate bookingDate;
    private static int bookingCount = 0;

    public Booking(Client client, Vehicle vehicle, int rentalDays) {
        super(rentalDays);
        this.client = client;
        this.vehicle = vehicle;
        bookingCount++;
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
    public String toString() {
        return "Booking{" +
                "client=" + client +
                ", vehicle=" + vehicle +
                ", bookingDate=" + bookingDate +
                '}';
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

    public static int getBookingCount() {
        return bookingCount;
    }

    @Override
    public void pay() {
        System.out.println("Payment of " + getRentalPrice() + " processed for " + client.getFirstName() + " " + client.getLastName());
    }
}
