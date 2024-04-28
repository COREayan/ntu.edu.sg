package one.one;

public class Circle {
    private double radius;
    private String color;
    public Circle() {
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "red";
    }

    public Circle(double r, String c) {
        this.radius = r;
        this.color = c;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }

}
