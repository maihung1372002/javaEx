package homework3;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    // contructor
    public MyPoint() {};
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int[] getXY() {
        int [] arr = {x, y};
        return arr;
    }

    // setter
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x +", " + y +")";
    }

    public double distance(int x, int y) {
        double temp = Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2);
        return Math.sqrt(temp);
    }
    public double distance(MyPoint another) {
        double temp = Math.pow(this.x - another.getX(), 2) +
         Math.pow(this.y - another.getY(), 2);
        return Math.sqrt(temp);
    }
    // with (0, 0)
    public double distance() {
        double temp = Math.pow(this.x, 2) + Math.pow(this.y, 2);
        return Math.sqrt(temp);
    }
}

