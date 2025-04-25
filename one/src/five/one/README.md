Let us begin with composition with the statement "a line composes of two points".

Complete the definition of the following two classes: Point and Line. The class Line composes 2 instances of class Point, representing the beginning and ending points of the line. Also write test classes for Point and Line (says TestPoint and TestLine).
```
public class Point {
   // Private variables
   private int x;    // x co-ordinate
   private int y;    // y co-ordinate
   
   // Constructor
   public Point (int x, int y) {......}
   
   // Public methods
   public String toString() {
      return "Point: (" + x + "," + y + ")";
   }
   
   public int getX() {......}
   public int getY() {......}
   public void setX(int x) {......}
   public void setY(int y) {......}
   public void setXY(int x, int y) {......}
}
```
```
public class TestPoint {
   public static void main(String[] args) {
      Point p1 = new Point(10, 20);   // Construct a Point
      System.out.println(p1);
      // Try setting p1 to (100, 10).
      ......
   }
}
public class Line {
   // A line composes of two points (as instance variables)
   private Point begin;    // beginning point
   private Point end;      // ending point
   
   // Constructors
   public Line (Point begin, Point end) {  // caller to construct the Points
      this.begin = begin;
      ......
   }
   public Line (int beginX, int beginY, int endX, int endY) {
      begin = new Point(beginX, beginY);   // construct the Points here
      ......
   }
   
   // Public methods
   public String toString() { ...... }
   
   public Point getBegin() { ...... }
   public Point getEnd() { ...... }
   public void setBegin(......) { ...... }
   public void setEnd(......) { ...... }
   
   public int getBeginX() { ...... }
   public int getBeginY() { ...... }
   public int getEndX() { ...... }
   public int getEndY() { ...... }
   
   public void setBeginX(......) { ...... }
   public void setBeginY(......) { ...... }
   public void setBeginXY(......) { ...... }
   public void setEndX(......) { ...... }
   public void setEndY(......) { ...... }
   public void setEndXY(......) { ...... }
   
   public int getLength() { ...... } // Length of the line
                                     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
   public double getGradient() { ...... } // Gradient in radians
                                          // Math.atan2(yDiff, xDiff)
}
```
```
public class TestLine {
   public static void main(String[] args) {
      Line l1 = new Line(0, 0, 3, 4);
      System.out.println(l1);
   
      Point p1 = new Point(...);
      Point p2 = new Point(...);
      Line l2 = new Line(p1, p2);
      System.out.println(l2);
      ...
   }
}
```
The class diagram for composition is as follows (where a diamond-hollow-head arrow pointing to its constituents):

ExerciseOOP_PointLineComp.png
Instead of composition, we can design a Line class using inheritance. Instead of "a line composes of two points", we can say that "a line is a point extended by another point", as shown in the following class diagram:

ExerciseOOP_PointLineInherit.png
Let's re-design the Line class (called LineSub) as a subclass of class Point. LineSub inherits the starting point from its superclass Point, and adds an ending point. Complete the class definition. Write a testing class called TestLineSub to test LineSub.

public class LineSub extends Point {
   // A line needs two points: begin and end.
   // The begin point is inherited from its superclass Point.
   // Private variables
   Point end;               // Ending point
   
   // Constructors
   public LineSub (int beginX, int beginY, int endX, int endY) {
      super(beginX, beginY);             // construct the begin Point
      this.end = new Point(endX, endY);  // construct the end Point
   }
   public LineSub (Point begin, Point end) {  // caller to construct the Points
      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
      this.end = end;
   }
   
   // Public methods
   // Inherits methods getX() and getY() from superclass Point
   public String toString() { ... }
   
   public Point getBegin() { ... }
   public Point getEnd() { ... }
   public void setBegin(...) { ... }
   public void setEnd(...) { ... }
   
   public int getBeginX() { ... }
   public int getBeginY() { ... }
   public int getEndX() { ... }
   public int getEndY() { ... }
   
   public void setBeginX(...) { ... }
   public void setBeginY(...) { ... }
   public void setBeginXY(...) { ... }
   public void setEndX(...) { ... }
   public void setEndY(...) { ... }
   public void setEndXY(...) { ... }
   
   public int getLength() { ... }       // Length of the line
   public double getGradient() { ... }  // Gradient in radians
}
Summary: There are two approaches that you can design a line, composition or inheritance. "A line composes two points" or "A line is a point extended with another point"”. Compare the Line and LineSub designs: Line uses composition and LineSub uses inheritance. Which design is better?
