package six.one;

public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle() {
        this(1.0, 1.0);
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }

    @Override
    double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    public String toString() {
        return "Rectangle["+super.toString()+"],width="+this.width+",length="+this.length+"]";
    }
}
