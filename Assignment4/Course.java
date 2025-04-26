public class Course {
    private String number;
    private int credits;
    private char grade;

    public Course (String number, int credits, char grade) {
        this.number = number;
        this.credits = credits;
        this.grade = grade;
    }

    public Course() {
        this("ABC 0000", 3, 'F');
    }

    @Override
    public String toString() {
        return number + " (" + credits + " credits), " + grade;
    }

    public String getNumber() {
        return number;
    }

    public int getCredits() {
        return credits;
    }

    public char getGrade() {
        return grade;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setGrade(char grade){
        this.grade = grade;
    }
}
