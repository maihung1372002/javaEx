package homework3;

public class MyLine {
    private MyPoint begin = new MyPoint(); 
    private MyPoint end = new MyPoint(); 

    // contructors
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin.setX(x1);
        this.begin.setY(y1);
        this.end.setX(x2);
        this.end.setY(y2);
    }
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // getters
    public MyPoint getBegin() {
        return begin;
    }
    public MyPoint getEnd() {
        return end;
    }
    public int getBeginX() {
        return begin.getX();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndY() {
        return end.getY();
    }
    public int[] getBeginXY() {
        int [] temp = begin.getXY();
        return temp;
    }
    public int[] getEndXY() {
        int [] temp = end.getXY();
        return temp;
    }

    public double getLength() {
        return begin.distance(end);
    }
    public double getGradient() {
        return 0.0;
    }

    // setter 
    public void setBegin(MyPoint begin) {
       this.begin = begin;
    }
    public void setEnd(MyPoint end) {
        this.end = end;
    }
    public void setBeginX(int x) {
        this.begin.setX(x);
    }
    public void setEndX(int x) {
        this.end.setX(x);
    }
    public void setBeginY(int y) {
        this.begin.setY(y);
    }
    public void setEndY(int y) {
        this.end.setY(y);
    }
    public void setBeginXY(int x, int y){
        this.begin.setXY(x, y);
    }
    public void setEndXY(int x, int y){
        this.end.setXY(x, y);
    }

    public String toString() {
        return "MyLine[begin = " + begin.toString() +
        ", end = " + end.toString() + "]";
    }
}
