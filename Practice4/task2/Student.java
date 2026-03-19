package task2;

public class Student extends Person implements CanHavePizza, CanHaveRetake, Movable{
    private String name;

    public Student(String name){
        super(name);
    }
    public void eatPizza(){
        System.out.println("Student eats pizza");
    }

    public void move(){
        System.out.println("Student is moving");
    }

    public void dance(){
        System.out.println("Student is dancing");
    }

    public void retakeExam(){
        System.out.println("Please no retake😭");
    }

}
