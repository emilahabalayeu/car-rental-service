package client;

import base.Document;

public class BankDetails extends Document {

    private String bankName;

    public BankDetails(String bankName, String accountNumber) {
        super(accountNumber);
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
