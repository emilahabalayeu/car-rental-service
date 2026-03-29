package interfaces;

@FunctionalInterface
public interface RentalValidator<T> {
    boolean validate(T item);
}