package task3;

public class Main {
    public static void main(String[] args) {

        Time t1 = new Time(23, 5, 6);
        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandart());

        Time t2 = new Time(4, 24, 33);
        t1.add(t2);

        System.out.println(t1.toUniversal());
        System.out.println(t1.toStandart());
    }
}
