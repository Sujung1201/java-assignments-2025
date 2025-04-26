public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time() {
        this(0, 0, 0);
    }

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("time1: " + time1);
        Time time2 = new Time(11, 11, 11);
        System.out.println("time2: " + time2);
    }
}
