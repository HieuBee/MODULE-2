package colorable;

public class Square extends Shape implements IColorable{
    private double edge;

    public Square() {
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public void getArea() {
        double S = 4 * edge;
        System.out.println("Area square: " + S);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }
}
