package personnel;

import base.Person;
import client.Address;
import client.ContactInfo;

public class Employee extends Person {

    private String position;
    private double salary;
    private Address address;

    public Employee(String firstName, String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public String getRole() {
        return position;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
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
}

