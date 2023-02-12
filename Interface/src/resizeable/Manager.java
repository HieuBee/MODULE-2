package resizeable;

public class Manager {
    public static void main(String[] args) {
        Circle circle = new Circle(17);
        Rectangle rectangle = new Rectangle(12, 2);
        Square square = new Square(2);
        circle.resize(50);
        rectangle.resize(50);
        square.resize(50);
    }
}
