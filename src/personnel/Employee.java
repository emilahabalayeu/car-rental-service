package personnel;

import client.Address;
import client.ContactInfo;

public class Employee {

    private String firstName;
    private String lastName;
    private String position;
    private double salary;
    private Address address;
    private ContactInfo contactInfo;

    public Employee(String firstName, String lastName, String position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
