package GeometryFigures;

public abstract class Parallelogram implements Figure {
    protected double a;

    public Parallelogram(double a) {
        this.a = a;
    }

    public abstract double getArea();
}
