package part6.ex3;

public class Pyramid extends Shape{
    private double s;
    private double h;

    public Pyramid(double s, double h) {
        super((s * h) / 3);
        this.s = s;
        this.h = h;
    }

    public double getS() {
        return s;
    }

    public double getH() {
        return h;
    }
}
