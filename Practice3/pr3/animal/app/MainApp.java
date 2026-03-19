package pr3.animal.app;
import pr3.animal.model.Animal;
import pr3.animal.model.Dog;
import java.util.*;


public class MainApp {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Roki", 2, "Chihuahua");
        Animal dog2 = new Dog("Lalu", 4, "Labrador");
        Dog dog3 = new Dog("Charlie", 2, "Beagle");

        List<Animal> animals = new ArrayList<>();

        animals.add(dog1);
        animals.add(dog2);
        animals.add(dog3);

        for(Animal animal : animals) {
            animal.makeSound();
            animal.eat();
            animal.eat("meat");
            animal.getInfo();
        }
    }
}
