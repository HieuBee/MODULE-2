package resizeable;

public class Square extends Shape implements IResizeable{
    private double edge;

    public Square() {
    }

    public Square(String color, boolean filled, double edge) {
        super(color, filled);
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" +
                "edge=" + getEdge() +
                '}';
    }

    public double getArea(){
        return this.edge * 4;
    }
    @Override
    public void resize(double percent) {
        this.edge *= percent / 100;
    }
}
