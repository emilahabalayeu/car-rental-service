package model;

public class CarRentalCompany {
    private String name;
    private Employee employee;
    private Vehicle vehicle;
    private Client client;
    private Booking booking;

    public CarRentalCompany(String name) {
        this.name = name;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getName() {
        return name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public Client getClient() {
        return client;
    }

    public Booking getBooking() {
        return booking;
    }
}
