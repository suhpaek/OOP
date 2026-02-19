package Problem3;

public class Temperature {
    private double value;
    private char scale;

    //4 constructors
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public Temperature(double value) {
        this(value, 'C');
    }

    public Temperature(char scale) {
        this(0, scale);
    }

    public Temperature(){
        this(0, 'C');
    }

    //(1) methods
    public double getCelsius(){
        if(scale == 'C') {
            return value;
        } else {
            return 5 * (value -32) / 9;
        }
    }

    public double getFahrenheit(){
        if(scale == 'F') {
            return value;
        } else {
            return 9 * (value / 5) + 32;
        }
    }

    //(2) methods
    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        if (scale=='C' || scale=='F') {
            this.scale = scale;
        }
    }

    public void setBoth(double value, char scale) {
        this.value = value;
        if (scale=='C' || scale=='F') {
            this.scale = scale;
        }
    }

    //(3) method
    public char getScale(){
        return scale;
    }
}
