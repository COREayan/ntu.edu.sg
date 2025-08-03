package two.nine;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this(new MyPoint(x1, y1), new MyPoint(x2, y2), new MyPoint(x3, y3));
    }

    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (d1 == d2 && d2 == d3 && d3 == d1) {
            return "Equilateral";
        } else {
            return "Isosceles";
        }
    }
}
