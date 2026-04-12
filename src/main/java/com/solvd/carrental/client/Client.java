package com.solvd.carrental.client;

import com.solvd.carrental.base.Person;
import com.solvd.carrental.enums.ClientType;
import com.solvd.carrental.interfaces.Payable;
import java.util.Objects;

public class Client extends Person implements Payable {

    private String type;
    private Address address;
    private BankDetails bankDetails;
    private ClientType clientType;

    public Client(String firstName, String lastName, String type) {
        super(firstName, lastName);
        this.type = type;
    }

    public String getRole() {
        return type;
    }

    @Override
    public String toString() {
        return "Client{" +
                "type='" + type + '\'' +
                ", address=" + address +
                ", bankDetails=" + bankDetails +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(type, client.type) && Objects.equals(address, client.address) && Objects.equals(bankDetails, client.bankDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, address, bankDetails);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public ClientType getClientType() {
        return clientType;
    }

    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    public String getType() {
        return type;
    }

    public Address getAddress() {
        return address;
    }

    public BankDetails getBankDetails() {
        return bankDetails;
    }

    @Override
    public void pay() {
        System.out.println("Client " + firstName + " " + lastName + " is paying deposit.");
    }
}
