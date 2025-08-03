package five.one;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        this(new Point(beginX, beginY), new Point(endX, endY));
    }

    public Point getBegin() {
        return this.begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return this.end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return this.begin.getX();
    }

    public int getBeginY() {
        return this.begin.getY();
    }

    public int getEndX() {
        return this.end.getX();
    }

    public int getEndY() {
        return this.end.getY();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    public int getXdiff() {
        return Math.abs(this.begin.getX() - this.end.getX());
    }

    public int getYdiff() {
        return Math.abs(this.begin.getY() - this.end.getY());
    }

    public int getLength() {
        return (int) Math.sqrt((getXdiff() * getXdiff()) + (getYdiff() * getYdiff()));
    }

    public double getGradient() {
        return Math.atan2(getYdiff(), getXdiff());
    }

}
