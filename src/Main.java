import booking.Booking;
import client.Address;
import client.BankDetails;
import client.Client;
import client.ContactInfo;
import exception.DatabaseConnectionException;
import personnel.Employee;
import vehicle.Car;
import vehicle.Engine;
import vehicle.Insurance;
import base.Vehicle;
import vehicle.Truck;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(160, 130);
        Engine engine2 = new Engine(750, 900);

        Address address1 = new Address("Belveder", "Wasrzawa", "Poland");

        ContactInfo contactInfo1 = new ContactInfo("234 456 654", "ssfdf@mail.com");

        BankDetails bankDetails1 = new BankDetails("PKO BP", "123 000 234 955");

        Insurance insurance1 = new Insurance("345642", LocalDate.of(2025, 12, 31));

        Car car1 = new Car("Passenger car", "Toyota", engine1);
        car1.setAvailable(true);
        car1.setInsurance(insurance1);

        Truck truck1 = new Truck("Truck", "Iveco", engine2);

        Client client1 = new Client("Ivan", "Ivanov", "Individual client");
        client1.setAddress(address1);
        client1.setContactInfo(contactInfo1);
        client1.setBankDetails(bankDetails1);

        Employee employee1 = new Employee("Valentina", "Stepanova", "Accountant");
        employee1.setAddress(address1);
        employee1.setContactInfo(contactInfo1);
        employee1.setSalary(5000);

        Booking booking1 = new Booking(client1, car1, 7);
        booking1.setBookingDate(LocalDate.now());
        booking1.setRentalPrice(new BigDecimal("500"));

        CarRentalCompany carRentalCompany1 = new CarRentalCompany("Pupkin Cars & Ko");
        carRentalCompany1.setEmployees(new Employee[]{employee1});
        carRentalCompany1.setVehicles(new Vehicle[]{car1, truck1});
        carRentalCompany1.setClients(new Client[]{client1});
        carRentalCompany1.setBookings(new Booking[]{booking1});

        booking1.confirmBooking();

        carRentalCompany1.printVehicleDescription(car1);
        carRentalCompany1.printVehicleDescription(truck1);

        carRentalCompany1.processPayment(booking1);
        carRentalCompany1.processPayment(client1);

        try {
            carRentalCompany1.connectToDatabase();
        } catch (DatabaseConnectionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            carRentalCompany1.connectToDatabase();
        } catch (DatabaseConnectionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Database connection attempt finished.");
        }
    }
}
