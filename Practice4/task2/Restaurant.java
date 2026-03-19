package task2;

public class Restaurant {
    public boolean servePizza(CanHavePizza eater){
        eater.eatPizza();
        if(eater instanceof Person){
            System.out.println("Process payment");
        }
        return true;
    }
}
