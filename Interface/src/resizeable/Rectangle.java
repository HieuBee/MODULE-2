package resizeable;

public class Rectangle extends Shape implements IResizeable{
    private double length, wight;

    public Rectangle() {
    }

    public Rectangle(String color, boolean filled, double length, double wight) {
        super(color, filled);
        this.length = length;
        this.wight = wight;
    }

    public Rectangle(double length, double wight) {
        this.length = length;
        this.wight = wight;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWight() {
        return wight;
    }

    public void setWight(double wight) {
        this.wight = wight;
    }

    public double getArea() {
        return (this.wight + this.length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + getLength() +
                ", wight=" + getWight() +
                '}';
    }

    @Override
    public void resize(double percent) {
        System.out.println("Before rectangle area: " + getArea());
        this.length *= percent / 100;
        this.wight *= percent / 100;
        System.out.println("After rectangle area: " + getArea());
    }
}
