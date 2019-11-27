package day_22;

/**
 * ClassName:Point
 * Package:day_22
 * Description:
 *
 * @date:2019/11/27 18:11
 * @author:Wang Jun
 */
public class Point {
    public Point(int num, double x, double y) {
        this.num = num;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", num=" + num +
                '}';
    }

    private double x;
    private double y;
    private int num;
    public static double distance(Point A,Point B){
        return Math.sqrt(Math.pow(A.x-B.x,2)+Math.pow(A.y- B.y,2));
    }

}
