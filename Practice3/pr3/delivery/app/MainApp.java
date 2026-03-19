package pr3.delivery.app;

import pr3.delivery.model.*;
import pr3.delivery.service.DeliveryService;

import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Engine e1 = new Engine("V6", 250);
        Engine e2 = new Engine("Diesel", 400);

        Car car = new Car(5, "Toyota Camry", 10000, e1);
        Truck truck = new Truck(2000, "MAN", 20000, e2);

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(truck);

        DeliveryService service = new DeliveryService();

        service.printAllVehicles(vehicles);
        service.calculateAllDeliveries(vehicles);

        System.out.println("TOTAL: " + service.calculateTotalCost(vehicles));
    }
}