package pr3.delivery.model;

public class Car extends Vehicle{
    private int numberOfSeats;

    public Car(int numberOfSeats, String model, double baseCost, Engine engine) {
        super(model, baseCost, engine);
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost * 1.2;
    }

    public double calculateDeliveryCost(double extraWeight) {
        return calculateDeliveryCost() + extraWeight * 0.5;
    }



}
