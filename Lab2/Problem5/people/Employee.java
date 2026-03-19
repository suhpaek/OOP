package Problem5.people;

public class Employee extends Person{
    private String workPlace;

    public Employee(String name, int age, String workPlace){
        super(name, age);
        this.workPlace = workPlace;
    }

    @Override
    public String getOccupation(){
        return "Work place: " + workPlace;
    }
}
