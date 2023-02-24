package GeometryFigures;

public class Square extends Rectangle {
    public Square(double a) {
        super(a);
    }
    // Длина стороны квадрата
    public double getArea() {
        return a * a;
    }
}
