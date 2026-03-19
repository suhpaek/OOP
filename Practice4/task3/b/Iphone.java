package task3.b;

public class Iphone implements SellableAndPluggable{
    @Override
    public void plug(){
        System.out.println("Iphone is plugged in");
    };

    @Override
    public void sell(){
        System.out.println("Iphone is being sold");
    };

}
