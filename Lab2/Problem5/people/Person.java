package Problem5.people;
import Problem5.pets.*;

public abstract class Person {
    private String name;
    private int age;
    private Animal pet;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public Animal getPet(){
        return pet;
    }

    public int getAge(){
        return age;
    }

    public void assignPet(Animal pet){
        this.pet = pet;
    }

    public void removePet(){
        this.pet = null;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public abstract String getOccupation();

    @Override
    public String toString(){
        return name + ", age=" + age + ", occupation=" + getOccupation() +
                ", pet=" + (pet == null ? "no pet" : pet.toString());
    }

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) {
            throw new IllegalStateException("This person has no pet");
        }
        if (caretaker == null) {
            throw new IllegalArgumentException("Caretaker is null");
        }
        if (caretaker.hasPet()) {
            throw new IllegalStateException("Caretaker already has a pet");
        }

        Animal temp = this.pet;
        this.pet = null;
        caretaker.assignPet(temp);
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) {
            throw new IllegalArgumentException("Caretaker is null");
        }
        if (!caretaker.hasPet()) {
            throw new IllegalStateException("Caretaker has no pet");
        }
        if (this.hasPet()) {
            throw new IllegalStateException("This person already has a pet");
        }

        Animal temp = caretaker.getPet();
        caretaker.removePet();
        this.assignPet(temp);
    }

}
