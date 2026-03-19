package Problem1.a;

public class Cube {
    private double width;

    public double volume() {
        return Math.pow(width, 3);
    }

    public double surfaceArea() {
        return 6 * width * width;
    }

}
