package Problem4;

import task1.Student;
import java.util.*;

public class GradeBook {
    private Course course;
    private List<Student> students;
    private Map<Student, Integer> grades;

    public GradeBook(Course course) {
        this(course, new ArrayList<>());
    }

    public GradeBook(Course course, List<Student> students) {
        this.course = course;
        this.students = new ArrayList<>(students);
        this.grades = new HashMap<>();
    }

    public void addStudent(Student student, int grade) {
        students.add(student);
        grades.put(student, grade);
    }

    public void displayMessage() {
        System.out.println("Welcome to the GradeBook for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        System.out.println("\n--- Grade Report ---");

        if (students.isEmpty() || grades.isEmpty()) {
            System.out.println("No students/grades to report");
            return;
        }

        double avg = determineClassAverage();
        Student maxStudent = getMaximumStudent();
        Student minStudent = getMinimumStudent();

        int max = getMaximumGrade();
        int min = getMinimumGrade();

        System.out.println("Class average = " + avg);
        System.out.println("Highest grade = " + max + " (student: " + maxStudent + ")");
        System.out.println("Lowest grade = " + min + " (student: " + minStudent + ")");

        outputBarChar();

    }

    public double determineClassAverage() {
        int sum = 0;
        int count = 0;

        for (Student s :students) {
            Integer g = grades.get(s);
            if(g != null) {
                sum += g;
                count++;
            }
        }
        return count == 0 ? 0.0 : (double) sum / count;
    }

    public int getMaximumGrade() {
        int max = Integer.MIN_VALUE;
        for (Student s : students) {
            Integer g =grades.get(s);
            if (g != null && g>max) max = g;
        }

        return max == Integer.MIN_VALUE ? 0 : max;
    }

    public int getMinimumGrade() {
        int min = Integer.MAX_VALUE;
        for (Student s : students) {
            Integer g =grades.get(s);
            if (g != null && g<min) min = g;
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public Student getMaximumStudent() {
        Student best = null;
        int bestGrade = Integer.MIN_VALUE;

        for (Student s : students) {
            Integer g = grades.get(s);
            if (g != null && g > bestGrade) {
                bestGrade = g;
                best = s;
            }
        }

        return best;
    }

    public Student getMinimumStudent() {
        Student worst = null;
        int worstGrade = Integer.MAX_VALUE;

        for (Student s : students) {
            Integer g = grades.get(s);
            if (g != null && g < worstGrade) {
                worstGrade = g;
                worst = s;
            }
        }

        return worst;
    }

    private int gradeToFrequencyIndex(int grade) {
        if (grade == 100) return 10;
        return Math.max(0, Math.min(9, grade / 10));
    }

    private void outputBarChar() {
        int[] freq = new int[11];

        for(Student s : students) {
            Integer g = grades.get(s);
            if (g != null) {
                int idx = gradeToFrequencyIndex(g);
                freq[idx]++;
            }
        }

        System.out.println("\nGrade distribution:");
        for (int i = 0; i< freq.length; i++) {
            String label;
            if (i == 10) label = "100: ";
            else label = (i * 10) + "-" + (i * 10 + 9) + ": ";

            System.out.print(label);
            for (int star = 0; star < freq[i]; star++) System.out.print("*");
            System.out.println(" (" + freq[i] + ")");
        }
    }

    public String toString() {
        return "GradeBook{course=" + course + ", students=" + students.size() + "}";
    }
}
