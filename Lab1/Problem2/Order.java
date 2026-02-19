package Problem2;

public class Order {
    private final int orderId;     //read-only identifier
    private String name;
    private static int counter;    //static field
    private Status status;
    private double price;

    //enum
    public enum Status {
        NEW,
        PAID,
        SHIPPED,
        DELIVERED
    }

    //initialization
    {
        counter++;
        orderId = counter;
    }

    //constructor
    public Order(String name, double price) {
        this.name = name;
        this.status = Status.NEW;
        this.price = price;
    }

    //method overloading
    public void applyDiscount(double percent){
        price = price - (price * percent / 100);
    }

    public void applyDiscount(double percent, double extra) {
        price = price - (price * (percent + extra) / 100);
    }

    //getters
    public String getName() {
        return name;
    }
    public int getOrderId() {
        return orderId;
    }

    public double getPrice() {
        return price;
    }

    public Status getStatus() {
        return status;
    }

    //static method
    public static int getTotalOrders() {
        return counter;
    }
}

