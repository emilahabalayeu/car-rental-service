package com.solvd.carrental.client;

import com.solvd.carrental.base.Document;

public class BankDetails extends Document {

    private String bankName;

    public BankDetails(String bankName, String accountNumber) {
        super(accountNumber);
        this.bankName = bankName;
    }

    @Override
    public String toString() {
        return bankName + " " + getDocumentNumber();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
}
