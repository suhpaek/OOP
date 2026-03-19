package Problem4.models;

public abstract class Circuit {
    //R
    public abstract double getResistance();

    //V
    public abstract double getPotentialDiff();


    public abstract void applyPotentialDiff(double V);

    //W, p=v*i
    public double getPower() {
        return getPotentialDiff() * getCurrent();
    }

    //I= v/r
    public double getCurrent() {
        return getPotentialDiff() / getResistance();
    }
}