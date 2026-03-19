package task4;

public class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int compareTo(Student other){
        return Double.compare(other.gpa, this.gpa);
    }

    @Override
    public String toString(){
        return name + " - " + gpa;
    }
}
