package Problem3;

public class Main {
    public static void main(String[] args) {

        // 4 constructors demo
        Temperature t1 = new Temperature(25, 'C');  // value + scale
        Temperature t2 = new Temperature(100);      // only value (default C)
        Temperature t3 = new Temperature('F');      // only scale (default 0)
        Temperature t4 = new Temperature();         // default (0C)

        System.out.println("t1: scale=" + t1.getScale() +
                ", C=" + t1.getCelsius() + ", F=" + t1.getFahrenheit());

        System.out.println("t2: scale=" + t2.getScale() +
                ", C=" + t2.getCelsius() + ", F=" + t2.getFahrenheit());

        System.out.println("t3: scale=" + t3.getScale() +
                ", C=" + t3.getCelsius() + ", F=" + t3.getFahrenheit());

        System.out.println("t4: scale=" + t4.getScale() +
                ", C=" + t4.getCelsius() + ", F=" + t4.getFahrenheit());

        // setters demo
        t4.setValue(10);
        t4.setScale('F');
        System.out.println("t4 after setValue + setScale: scale=" + t4.getScale() +
                ", C=" + t4.getCelsius() + ", F=" + t4.getFahrenheit());

        t4.setBoth(0, 'C');
        System.out.println("t4 after setBoth: scale=" + t4.getScale() +
                ", C=" + t4.getCelsius() + ", F=" + t4.getFahrenheit());

        // invalid scale test (should not change)
        t4.setScale('X');
        System.out.println("t4 after invalid scale 'X': scale=" + t4.getScale());
    }
}
