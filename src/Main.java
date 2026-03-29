import booking.Booking;
import client.Address;
import client.BankDetails;
import client.Client;
import client.ContactInfo;
import enums.BookingStatus;
import enums.PaymentStatus;
import enums.VehicleType;
import exception.DatabaseConnectionException;
import interfaces.BookingFormatter;
import interfaces.PriceCalculator;
import interfaces.RentalValidator;
import personnel.Employee;
import vehicle.Car;
import vehicle.Engine;
import vehicle.Insurance;
import base.Vehicle;
import vehicle.Truck;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {

        Engine engine1 = new Engine(160, 130);
        Engine engine2 = new Engine(750, 900);

        Address address1 = new Address("Belveder", "Wasrzawa", "Poland");

        ContactInfo contactInfo1 = new ContactInfo("234 456 654", "ssfdf@mail.com");

        BankDetails bankDetails1 = new BankDetails("PKO BP", "123 000 234 955");

        Insurance insurance1 = new Insurance("345642", LocalDate.of(2025, 12, 31));

        Car car1 = new Car("Passenger car", "Toyota", engine1, VehicleType.CAR);
        car1.setAvailable(true);
        car1.setInsurance(insurance1);

        Truck truck1 = new Truck("Truck", "Iveco", engine2, VehicleType.TRUCK);

        Client client1 = new Client("Ivan", "Ivanov", "Individual client");
        client1.setAddress(address1);
        client1.setContactInfo(contactInfo1);
        client1.setBankDetails(bankDetails1);

        Employee employee1 = new Employee("Valentina", "Stepanova", "Accountant");
        employee1.setAddress(address1);
        employee1.setContactInfo(contactInfo1);
        employee1.setSalary(5000);

        Booking booking1 = new Booking(client1, car1, 7, BookingStatus.CONFIRMED, PaymentStatus.UNPAID);
        booking1.setBookingDate(LocalDate.now());
        booking1.setRentalPrice(new BigDecimal("500"));

        CarRentalCompany carRentalCompany1 = new CarRentalCompany("Pupkin Cars & Ko");

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        carRentalCompany1.setEmployees(employees);

        Set<Vehicle> vehicles = new HashSet<>();
        vehicles.add(car1);
        vehicles.add(truck1);
        carRentalCompany1.setVehicles(vehicles);

        List<Client> clients = new ArrayList<>();
        clients.add(client1);
        carRentalCompany1.setClients(clients);

        Map<String, Booking> bookings = new HashMap<>();
        bookings.put("0001", booking1);
        carRentalCompany1.setBookings(bookings);

        booking1.confirmBooking();

        carRentalCompany1.printVehicleDescription(car1);
        carRentalCompany1.printVehicleDescription(truck1);

        carRentalCompany1.processPayment(booking1);
        carRentalCompany1.processPayment(client1);

        carRentalCompany1.printAllClients();
        carRentalCompany1.printAllVehicles();
        carRentalCompany1.printAllBookings();
        System.out.println("First client: " + carRentalCompany1.getFirstClient().getFirstName());

        Pair<String, Integer> rentalInfo = new Pair<>("Toyota", 7);
        System.out.println("Rental info: " + rentalInfo);

        RentalRepository<Client> clientRepository = new RentalRepository<>();
        clientRepository.add(client1);
        System.out.println("Repository size: " + clientRepository.size());
        System.out.println("First in repository: " + clientRepository.get(0).getFirstName());

        BookingRecord bookingRecord = new BookingRecord(
                client1.getFirstName() + " " + client1.getLastName(),
                car1.getBrand(),
                7,
                BookingStatus.CONFIRMED.getDisplayName()
        );
        System.out.println("Booking record: " + bookingRecord);

        // 3 кастомных лямбды
        RentalValidator<Vehicle> isAvailableValidator = vehicle -> vehicle.isAvailable();
        System.out.println("Is car available: " + isAvailableValidator.validate(car1));

        PriceCalculator calculator = (days, pricePerDay) -> days * pricePerDay;
        System.out.println("Total price: " + calculator.calculate(7, 100.0));

        BookingFormatter formatter = (clientName, vehicleBrand, days) ->
                "Booking: " + clientName + " rented " + vehicleBrand + " for " + days + " days";
        System.out.println(formatter.format("Ivan Ivanov", "Toyota", 7));

// 5 лямбд из java.util.function
        Predicate<Vehicle> hasInsurance = vehicle -> vehicle.getInsurance() != null;
        System.out.println("Car has insurance: " + hasInsurance.test(car1));

        Function<Client, String> getFullName = client -> client.getFirstName() + " " + client.getLastName();
        System.out.println("Full name: " + getFullName.apply(client1));

        Consumer<Booking> printBooking = booking -> System.out.println("Booking for: " + booking.getClient().getFirstName());
        printBooking.accept(booking1);

        Supplier<String> defaultCompanyName = () -> CarRentalCompany.getDefaultCompanyName();
        System.out.println("Default company: " + defaultCompanyName.get());

        BiFunction<Integer, Double, Double> totalPrice = (days, price) -> days * price;
        System.out.println("Calculated price: " + totalPrice.apply(7, 100.0));

        try {
            carRentalCompany1.connectToDatabase();
        } catch (DatabaseConnectionException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Database connection attempt finished.");
        }
    }
}
