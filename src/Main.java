import model.*;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Engine engine1 = new Engine(160, 130);

        Address address1 = new Address("Belveder", "Wasrzawa", "Poland");

        ContactInfo contactInfo1 = new ContactInfo("234 456 654", "ssfdf@mail.com");

        BankDetails bankDetails1 = new BankDetails("PKO BP", "123 000 234 955");

        Insurance insurance1 = new Insurance("345642", LocalDate.of(2025, 12, 31));

        Vehicle vehicle1 = new Vehicle("Passenger car", "Toyota", engine1);
        vehicle1.setAvailable(true);
        vehicle1.setInsurance(insurance1);

        Client client1 = new Client("Ivanov I. I.", "Individual client");
        client1.setAddress(address1);
        client1.setContactInfo(contactInfo1);
        client1.setBankDetails(bankDetails1);

        Employee employee1 = new Employee("Valentina", "Stepanova", "Accountant");
        employee1.setAddress(address1);
        employee1.setContactInfo(contactInfo1);
        employee1.setSalary(5000);

        Booking booking1 = new Booking(client1, vehicle1, 7);
        booking1.setBookingDate(LocalDate.now());
        booking1.setRentalPrice(new BigDecimal("500"));

        CarRentalCompany carRentalCompany1 = new CarRentalCompany("Pupkin Cars & Ko");
        carRentalCompany1.setEmployee(employee1);
        carRentalCompany1.setVehicle(vehicle1);
        carRentalCompany1.setClient(client1);
        carRentalCompany1.setBooking(booking1);

        booking1.confirmBooking();
    }
}
