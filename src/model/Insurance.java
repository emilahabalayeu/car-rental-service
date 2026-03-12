package model;

import java.time.LocalDate;

public class Insurance {
    private String policyNumber;
    private LocalDate expiryDate;

    public Insurance(String policyNumber, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.expiryDate = expiryDate;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
