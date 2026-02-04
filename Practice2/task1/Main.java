package task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String id = sc.nextLine();

        Student s = new Student(name, id);
        System.out.println(s.getName());
        System.out.println(s.getId());

        s.incrementYear();

    }
}
