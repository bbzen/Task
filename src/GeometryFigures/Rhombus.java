package GeometryFigures;

public class Rhombus extends Parallelogram {
    // Длина стороны ромба
    protected double h;


    public Rhombus(double a, double h) {
        super(a);
        this.h = h;

    }

    public double getArea() {
        return a * h;
    }
}
