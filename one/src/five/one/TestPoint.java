package five.one;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        System.out.println(p1);

        // Try setting p1 to (100, 10)
        p1.setX(100);
        p1.setY(10);
        System.out.println(p1);

        // setting p1 to previous value
        p1.setXY(10, 20);
        System.out.println(p1);
    }
}
