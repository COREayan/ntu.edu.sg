package one.eight;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getSecond() {
        return this.second;
    }

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

    public String toString() {
        return String.format("%02d",this.hour)+":"+String.format("%02d",this.minute)+":"+String.format("%02d",this.second);
    }

    public Time nextSecond() {
        if (this.second<59) {
            return new Time(this.hour, this.minute, this.second+1);
        }
        if (this.minute<59) {
            return new Time(this.hour, this.minute+1, 0);
        }
        if (this.hour<23) {
            return new Time(this.hour+1, 0, 0);
        }
        return new Time(0, 0, 0);
    }

    public Time previousSecond() {
        if (this.second>0) {
            return new Time(this.hour, this.minute, this.second-1);
        }
        if (this.minute>0) {
            return new Time(this.hour, this.minute-1, 59);
        }
        if (this.minute>0) {
            return new Time(this.hour-1, 59, 59);
        }
        return new Time(23, 59, 59);
    }
}
