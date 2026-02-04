package task2;
import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner bebe= new Scanner(System.in);
        double x= bebe.nextDouble();
        System.out.println("Area, perimeter:"+Math.pow(x, 2));
        System.out.println("Perimeter: "+ 4*x);
        System.out.println("Length of diagonal side:"+x*Math.sqrt(2));
    }
}