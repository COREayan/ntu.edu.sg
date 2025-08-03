package three.six;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x1 + width - 1;
        this.y2 = y1 + height - 1;
    }

    public boolean collides(Ball ball) {
        /*
        * A boolean method called collidesWith(Ball), which check if the given Ball is outside the bounds of the container box. If so, it invokes the Ball's reflectHorizontal()
        * and/or reflectVertical() to change the movement direction of the ball, and returns true.
        * */
        if (ball.getX() - ball.getRadius() <= this.x1 || ball.getX() - ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            return true;
        }

        if (ball.getY() - ball.getRadius() <= this.y1 || ball.getY() - ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            return true;
        }

        return false;
    }

    public String toString() {
        return "Container[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]";
    }
}
