import booking.Booking;
import client.Client;
import interfaces.Payable;
import personnel.Employee;
import base.Vehicle;

public class CarRentalCompany {

    private String name;
    public static final int MAX_RENTAL_DAYS = 30;
    static {
        System.out.println("CarRentalCompany class loaded. Max rental days: " + MAX_RENTAL_DAYS);
    }
    private Employee[] employees;
    private Vehicle[] vehicles;
    private Client[] clients;
    private Booking[] bookings;

    public CarRentalCompany(String name) {
        this.name = name;
    }

    public void printVehicleDescription(Vehicle vehicle) {
        System.out.println(vehicle.getDescription());
    }

    public void processPayment(Payable payable) {
        payable.pay();
    }

    public static String getDefaultCompanyName() {
        return "Car Rental Service";
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }

    public void setBookings(Booking[] bookings) {
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public Client[] getClients() {
        return clients;
    }

    public Booking[] getBookings() {
        return bookings;
    }
}