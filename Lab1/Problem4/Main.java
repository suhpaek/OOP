package Problem4;

import task1.Student;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course course = new Course(
                "OOP",
                "Object Oriented Programming",
                5,
                Arrays.asList("Intro to Programming")
        );

        Student s1 = new Student("Aruzhan", "B001");
        Student s2 = new Student("Dana", "B002");
        Student s3 = new Student("Ali", "B003");

        GradeBook gradeBook = new GradeBook(course);

        System.out.print("Enter grade for " + s1.getName() + ": ");
        int g1 = sc.nextInt();

        System.out.print("Enter grade for " + s2.getName() + ": ");
        int g2 = sc.nextInt();

        System.out.print("Enter grade for " + s3.getName() + ": ");
        int g3 = sc.nextInt();

        gradeBook.addStudent(s1, g1);
        gradeBook.addStudent(s2, g2);
        gradeBook.addStudent(s3, g3);

        gradeBook.displayMessage();
        gradeBook.displayGradeReport();

        sc.close();
    }
}
