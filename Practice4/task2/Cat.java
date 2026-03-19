package task2;

public class Cat implements CanHavePizza{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    public void eatPizza(){
        System.out.println("Cat eats pizza");
    }
}
