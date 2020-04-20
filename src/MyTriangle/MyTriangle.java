import java.awt.*;
import java.util.*;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2,y2);
        this.v3.setXY(x3,y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }
    public String toString() {
        Formatter formatter = new Formatter();
        return String.format("MyTriangle[v1 = (%d,%d), v2 = (%d,%d), v3 = (%d,%d)]",
                this.v1.getX(), this.v1.getY(), this.v2.getX(),
                this.v2.getY(), this.v3.getX(), this.v3.getY());
    }
    public double getPerimeter() {
        return this.v1.distance(this.v2) + this.v2.distance(this.v3) + this.v3.distance(this.v1);
    }
    public String getType() {
        double e1 = this.v1.distance(this.v2);
        double e2 = this.v2.distance(this.v3);
        double e3 = this.v3.distance(this.v1);
        if (e1 == e2) {
            if (e1 == e3) {
                return "Equilateral";
            }
            else {
                return "Isosceles";
            }
        }
        else {
            return "Scalene";
        }

    }
}
