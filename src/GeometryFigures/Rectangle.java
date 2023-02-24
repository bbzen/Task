package GeometryFigures;

public class Rectangle extends Parallelogram {
    // Длины сторон прямоугольника
    protected double b;

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }
    public Rectangle(double a) {
        super(a);
    }

    public double getArea() {
        return a * b;
    }
}
