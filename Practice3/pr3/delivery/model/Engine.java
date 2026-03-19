package pr3.delivery.model;

public class Engine {
    protected String type;
    protected double horsePower;

    public Engine(String type, double horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public void getEngineInfo() {
        System.out.println("Type: " + type);
        System.out.println("Horse Power: " + horsePower);
    }
}
