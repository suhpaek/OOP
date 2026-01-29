package task4;
import java.util.Scanner;

public class Roots {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double D=b*b-4*a*c;
        if(D<0){
            System.out.println("error");
        }else if(D==0){
            double x=-b/(2*a);
            System.out.println("X= "+x);
        }else{
            double x1=(-b+Math.sqrt(D))/(2*a);
            double x2=(-b-Math.sqrt(D))/(2*a);
            System.out.println("X1: "+x1);
            System.out.println("X2: "+x2);
        }

    }
}