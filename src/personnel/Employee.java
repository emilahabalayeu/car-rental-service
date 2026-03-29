package personnel;

import base.Person;
import client.Address;
import enums.EmployeePosition;

public class Employee extends Person {

    private String positionTitle;
    private EmployeePosition employeePosition;
    private double salary;
    private Address address;

    public Employee(String firstName, String lastName, String positionTitle) {
        super(firstName, lastName);
        this.positionTitle = positionTitle;
    }

    public String getRole() {
        return positionTitle;
    }

    public String getPosition() {
        return positionTitle;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
}