package base;

import client.ContactInfo;
import interfaces.Contactable;

public abstract class Person implements Contactable {

    protected String firstName;
    protected String lastName;
    private ContactInfo contactInfo;

    public abstract String getRole();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void contact() {
        System.out.println("Contacting: " + firstName + " " + lastName);
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

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
