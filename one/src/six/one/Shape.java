package six.one;

public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape() {
        this("red", true);
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract double getArea();

    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[color="+this.color+",filled="+this.filled+"]";
    }

}
