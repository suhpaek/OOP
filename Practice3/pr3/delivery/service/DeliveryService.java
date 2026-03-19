package pr3.delivery.service;
import java.util.*;
import pr3.delivery.model.*;

import java.util.ArrayList;

public class DeliveryService {
    List<Vehicle> vehicles = new ArrayList<>();

    public void printAllVehicles(List<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println("-----");
            System.out.println(vehicle.getVehicleInfo());
        }
        System.out.println("-----");
    }

    public void calculateAllDeliveries(List<Vehicle> vehicles) {
        for(Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleInfo());
            System.out.println("Delivery cost: " + vehicle.calculateDeliveryCost());

        }
    }

    public double calculateTotalCost(List<Vehicle> vehicles) {
        double sum = 0;
        for (Vehicle vehicle : vehicles) {
            sum += vehicle.calculateDeliveryCost();
        }
        return sum;
    }
}
