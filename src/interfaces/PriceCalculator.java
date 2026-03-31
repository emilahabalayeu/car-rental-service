package interfaces;

@FunctionalInterface
public interface PriceCalculator {
    double calculate(int days, double pricePerDay);
}