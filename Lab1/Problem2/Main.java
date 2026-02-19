package Problem2;

public class Main {
    public static void main(String[] args) {

        Order o1 = new Order("Aruzhan", 100);
        Order o2 = new Order("Dana", 200);

        o1.applyDiscount(10);          // first overloaded method
        o2.applyDiscount(10, 5);       // second overloaded method

        System.out.println("Order 1 ID: " + o1.getOrderId());
        System.out.println("Order 1 Price: " + o1.getPrice());

        System.out.println("Order 2 ID: " + o2.getOrderId());
        System.out.println("Order 2 Price: " + o2.getPrice());

        System.out.println("Total Orders: " + Order.getTotalOrders());
    }
}
