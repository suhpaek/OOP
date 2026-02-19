package Problem1;

public class Data {
    private int count;
    private double max;
    private double sum;

    public Data() {
        sum = 0.0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;
    }

    public void add(double value) {
        sum += value;
        if (count == 0 || value > max) {
            max = value;
        }
        count++;
    }

    public double getAverage() {
        if (count == 0) return 0.0;
        else return sum / count;
    }

    public double getMaximum() {
        if (count == 0) return 0.0;
        return max;
    }


}
