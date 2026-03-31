import booking.Booking;
import client.Client;
import exception.ClientNotFoundException;
import exception.DatabaseConnectionException;
import personnel.Employee;
import base.Vehicle;
import interfaces.Payable;
import java.util.*;
import java.util.function.Predicate;

public class CarRentalCompany {

    private String name;
    private List<Employee> employees = new ArrayList<>();
    private Set<Vehicle> vehicles = new HashSet<>();
    private List<Client> clients = new ArrayList<>();
    private Map<String, Booking> bookings = new HashMap<>();

    public static final int MAX_RENTAL_DAYS = 30;

    static {
        System.out.println("CarRentalCompany class loaded. Max rental days: " + MAX_RENTAL_DAYS);
    }

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

    public void addClient(Client client) {
        clients.add(client);
        System.out.println("Client added: " + client.getFirstName());
    }

    public void removeClient(Client client) {
        clients.remove(client);
        System.out.println("Client removed: " + client.getFirstName());
    }

    public void printAllClients() {
        System.out.println("Total clients: " + clients.size());
        for (Client client : clients) {
            System.out.println("- " + client.getFirstName() + " " + client.getLastName());
        }
    }

    public Client getFirstClient() {
        if (clients.isEmpty()) {
            throw new ClientNotFoundException("No clients found!");
        }
        return clients.get(0);
    }

    public void printAllVehicles() {
        for (Vehicle vehicle : vehicles) {
            System.out.println("- " + vehicle.getBrand());
        }
    }

    public void printAllBookings() {
        for (Map.Entry<String, Booking> entry : bookings.entrySet()) {
            System.out.println("Booking code: " + entry.getKey() + ", client: " + entry.getValue().getClient().getFirstName());
        }
    }

    public List<Vehicle> filterVehicles(Predicate<Vehicle> predicate) {
        List<Vehicle> result = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (predicate.test(vehicle)) {
                result.add(vehicle);
            }
        }
        return result;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public void setBookings(Map<String, Booking> bookings) {
        this.bookings = bookings;
    }

    public String getName() {
        return name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Client> getClients() {
        return clients;
    }

    public Map<String, Booking> getBookings() {
        return bookings;
    }
}