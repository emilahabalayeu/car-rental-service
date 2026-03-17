package base;

import client.ContactInfo;

public abstract class Person {
    protected String firstName;
    protected String lastName;
    private ContactInfo contactInfo;

    public abstract String getRole();

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
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
