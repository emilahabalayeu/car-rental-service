public class RentalLogger implements AutoCloseable {

    public RentalLogger() {
        System.out.println("RentalLogger opened.");
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }

    @Override
    public void close() {
        System.out.println("RentalLogger closed.");
    }
}