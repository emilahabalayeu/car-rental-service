package vehicle;

import base.Document;

import java.time.LocalDate;

public class Insurance extends Document {

    private LocalDate expiryDate;

    public Insurance(String policyNumber, LocalDate expiryDate) {
        super(policyNumber);
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}
