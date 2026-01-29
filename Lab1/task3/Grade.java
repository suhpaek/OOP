package task3;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        double x=sc.nextDouble();
        System.out.print("Grade: ");
        if(x>=94.5){
            System.out.print("A");
        }else if(x>=89.5 && x<94.5){
            System.out.println("A-");
        }else if(x>=84.5 && x<89.5) {
            System.out.println("B+");
        }else if(x>=79.5 && x<84.5){
            System.out.println("B");
        }else if(x>=74.5 && x<79.5){
            System.out.println("B-");
        }else if(x>=69.5 && x<74.5){
            System.out.println("C+");
        }else if(x>=64.5 && x<69.5){
            System.out.println("C");
        }else if(x>=59.5 && x<64.5){
            System.out.println("C-");
        }else if(x>=54.5 && x<59.5){
            System.out.println("D+");
        }else if(x>=49.5 && x<54.5) {
            System.out.println("D");
        }else if(x<49.5){
            System.out.println("F");
        }

    }
}