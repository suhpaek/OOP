package task4;
import java.util.*;

public class Main {
    public static void main(String[] args){
        List<Student> students = new ArrayList<>();

        students.add(new Student("Aruzhan", 3.07));
        students.add(new Student("Nursultan", 2.8));
        students.add(new Student("Amina", 3.1));
        students.add(new Student("Darkhan", 3.9));

        Collections.sort(students);
        System.out.println("Sorted by gpa: ");
        System.out.println(students);

        Collections.sort(students, new NameComparator());
        System.out.println("Sorted by name: ");
        System.out.println(students);

    }
}
