package homework3;

public class MyCircle {
    private MyPoint center = new MyPoint(0, 0);
    private int radius = 1;

    // contructor 
    public MyCircle() {};
    public MyCircle(int x, int y,int radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // getters
    public int getRadius() {
        return radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public int[] getCenterXY() {
        int [] temp = center.getXY();
        return temp;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }


    // setters
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public void setCenterX(int x) {
        this.center.setX(x);
    }
    public void setCenterY(int y) {
        this.center.setY(y);
    }
    public void setCenterXY(int x, int y) {
        this.center.setXY(x, y);
    }

    public String toString() {
        return "MyCircle[radius = " + radius +
        ", center" + center.toString() + "]";
    }
    public double distance(MyCircle another) {
        return center.distance(another.getCenter());
    }

}
