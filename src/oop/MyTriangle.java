package oop;

public class MyTriangle {
    private MyPoint v3;
    private MyPoint v2;
    private MyPoint v1;

    // contructor
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1.setXY(x1, y1);
        this.v2.setXY(x2, y2);
        this.v3.setXY(x3, y3);
    }
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[v1 = " + v1.toString() +
        ", v2 = " + v2.toString() + 
        ", v3 = " + v3.toString() + "]";
    }
    public double getPerimeter() {
        double d1 = Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2)
			+ Math.pow(v1.getY() - v2.getY(), 2));
		double d2 = Math.sqrt(Math.pow(v1.getX() - v3.getX(), 2)
			+ Math.pow(v1.getY() - v3.getY(), 2));
		double d3 = Math.sqrt(Math.pow(v2.getX() - v3.getX(), 2)
			+ Math.pow(v2.getY() - v3.getY(), 2));
		return d1 + d2 + d3;
    }
}
