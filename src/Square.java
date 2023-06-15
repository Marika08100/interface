public class Square implements Shape{
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public double getPerimeter() {
        return 4 * sideLength;
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }
}
