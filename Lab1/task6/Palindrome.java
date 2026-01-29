package task6;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String r=new StringBuilder(s).reverse().toString();
        if(s.equals(r)){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}