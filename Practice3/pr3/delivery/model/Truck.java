package pr3.delivery.model;

public class Truck extends Vehicle{
    private int maxLoad;

    public Truck(int maxLoad, String model, double baseCost, Engine engine) {
        super(model, baseCost, engine);
        this.maxLoad = maxLoad;
    }

    @Override
    public double calculateDeliveryCost() {
        return baseCost * 1.3;
    }

    public double calculateDeliveryCost(double distance, double fuelPrice) {
        return (calculateDeliveryCost() + distance) * fuelPrice;
    }

}
