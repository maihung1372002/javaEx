package homework3;

public class Date {
    private int day;
    private int month;
    private int year;
    
    // contructor
    public Date(int day, int month, int year)  {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // getter
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // setter
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        String d = day < 10 ? "0" + day : "" + day;
        String m = month < 10 ? "0" + month : "" + month;
        return d + "/" + m + "/" + year;
    }
}
