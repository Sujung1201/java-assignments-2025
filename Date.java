public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
        this(2000, 1, 1);
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }

    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println("date1: " + date1);
        Date date2 = new Date(2018, 2, 1);
        System.out.println("date2: " + date2);
    }
}
