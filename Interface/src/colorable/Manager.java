package colorable;

public class Manager {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];

        shapes[0] = new Square(5);
        shapes[1] = new Circle(5);

        for (Shape shape : shapes) {
            if (shape.isFilled()){
                shape.getArea();
                shape.howToColor();
                System.out.println("-----------");
            }
        }
    }
}
