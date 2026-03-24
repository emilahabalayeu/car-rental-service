import booking.Booking;
import client.Client;
import exception.ClientNotFoundException;
import exception.DatabaseConnectionException;
import personnel.Employee;
import base.Vehicle;
import interfaces.Payable;

public class CarRentalCompany {

    private String name;
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

    public static final int MAX_RENTAL_DAYS = 30;

    static {
        System.out.println("CarRentalCompany class loaded. Max rental days: " + MAX_RENTAL_DAYS);
    }

    public void processPayment(Payable payable) {
        payable.pay();
    }

    public static String getDefaultCompanyName() {
        return "Car Rental Service";
    }

    public Client findClient(String name) {
        for (Client client : clients) {
            if (client.getFirstName().equals(name)) {
                return client;
            }
        }
        throw new ClientNotFoundException("Client " + name + " not found!");
    }

    public void connectToDatabase() throws DatabaseConnectionException {
        throw new DatabaseConnectionException("Cannot connect to database!");
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