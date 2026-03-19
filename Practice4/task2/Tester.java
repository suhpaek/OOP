package task2;
import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Student student = new Student("Aru");
        Cat cat = new Cat("Nursultan");
        Restaurant restaurant = new Restaurant();
        restaurant.servePizza(cat);
        restaurant.servePizza(student);
    }
}
