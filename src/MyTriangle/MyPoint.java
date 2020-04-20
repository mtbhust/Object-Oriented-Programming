import java.lang.*;
public class MyPoint {
    private int x ;
    private int y ;
    public void MyPoint(){
        this.x = 0;
        this.y = 0;
    };
    public void MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public int getY () {
        return y;
    }

    public void setX (int x) {
        this.x = x;
    }

    public void setY (int y) {
        this.y = y;
    }

    public int[] getXY() {
        int[] a = {x, y};
        return a;
    }

    public void setXY(int x, int y) {
        this.setX(x);
        this.setY(y);
    }
    public String toString(){
        return "(" +  Integer.toString(this.x) +"," + Integer.toString(this.y) + ")";
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow((this.x - x),2) + Math.pow((this.y - y),2));
    }
    public double distance(MyPoint point){
        return this.distance(point.getX(), point.getY());
    }
    public double distance() {
        return this.distance(0,0);
    }
}
