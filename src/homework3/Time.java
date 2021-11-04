package homework3;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // contructor

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    // getter
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }

    // setter

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    } 
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void nextSecond() {
        this.second = second == 59 ? 0 : second + 1;
    }
    public void previousSecond() {
        this.second = second == 0 ? 59 : second - 1;
    }
    // end setter

    public String toString() {
        String h = hour < 10 ? "0" + hour : "" + hour;
        String m = minute < 10 ? "0" + minute : "" + minute;
        String s = second < 10 ? "0" + second : "" + second;
        return h + ":" + m + ":" + s;
    }
}
