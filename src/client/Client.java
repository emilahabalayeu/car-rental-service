package client;

public class Client {

    private String name;
    private String type;
    private Address address;
    private BankDetails bankDetails;
    private ContactInfo contactInfo;

    public Client(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setBankDetails(BankDetails bankDetails) {
        this.bankDetails = bankDetails;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getName() {
        return name;
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

    public ContactInfo getContactInfo() {
        return contactInfo;
    }
}
