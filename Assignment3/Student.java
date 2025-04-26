public class Student {
    private String firstName;
    private String lastName;
    private String id;

    public Student() {
        this("John", "Doe");
    }

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        id = "700";
        for (int i = 0; i < 6; i++) {
            int x = (int) (Math.random() * 9) + 1;
            id += String.valueOf(x);
        }
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName + " (" + id + ")";
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getID() {
        return id;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
