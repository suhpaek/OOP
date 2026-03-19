package Problem5.people;
import Problem5.pets.*;

public class PhDStudent extends Student {
    private String researchTopic;

    public PhDStudent(String name, int age, String major, String researchTopic) {
        super(name, age, major);
        this.researchTopic = researchTopic;
    }

    @Override
    public String getOccupation() {
        return "PhD Student: " + researchTopic;
    }

    @Override
    public void assignPet(Animal pet) {
        if (pet instanceof Dog) {
            throw new IllegalArgumentException("PhDStudent cannot have a dog");
        }
        super.assignPet(pet);
    }
}