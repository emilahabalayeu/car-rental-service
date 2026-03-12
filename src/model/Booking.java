package model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Booking {
    private Client client;
    private Vehicle vehicle;
    private int rentalDays;
    private BigDecimal rentalPrice;
    private LocalDate bookingDate;

    public Booking(Client client, Vehicle vehicle, int rentalDays) {
        this.client = client;
        this.vehicle = vehicle;
        this.rentalDays = rentalDays;
    }

    public void confirmBooking(){
        System.out.println("Booking confirmed!"
                + "\nClient: " + client.getName()
                + "\nVehicle: " + vehicle.getBrand()
                + "\nDays: " + rentalDays
                + "\nPrice: " + rentalPrice
                + "\nDate: " + bookingDate);
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
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

    public int getRentalDays() {
        return rentalDays;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }

    public LocalDate getBookingDate() {
        return bookingDate;
    }
}
