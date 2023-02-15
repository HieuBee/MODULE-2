package resizeable;

public class ManagerShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(17, 12);
        shapes[2] = new Square(2);

        for (Shape shape : shapes) {
            double percent = 100 * Math.random();
            shape.resize(percent);
            System.out.println(shape.getArea());
        }
    }
}
