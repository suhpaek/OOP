package task5;
import java.util.Scanner;

public class Balance {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double balance=sc.nextDouble();
        double percent=sc.nextDouble();
        double percent_res=percent/100;
        double new_balance=balance+balance*percent_res;
        double difference=new_balance-balance;
        System.out.println("Balance: "+balance);
        System.out.println("Interest: "+percent);
        System.out.println("Interest in money: "+difference);
        System.out.println("New balance: "+new_balance);
    }
}