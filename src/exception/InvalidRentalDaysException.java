package exception;

public class InvalidRentalDaysException extends RuntimeException {

    public InvalidRentalDaysException(String message) {
        super(message);
    }
}
