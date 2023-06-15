public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(2);
        System.out.println("Circle area " + shape.getArea());
        System.out.println("Circle perimeter " + shape.getPerimeter());

        Shape square   = new Square(2);
        System.out.println("Square area " + square.getArea());
        System.out.println("Square perimeter " + square.getPerimeter());

    }
}
