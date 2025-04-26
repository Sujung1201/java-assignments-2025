public class Transcript {
    private Course[] courses;

    public Transcript(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Course       Credits     Grade\n");
        for (Course course : courses) {
            String[] parts = course.toString().split(", ");
            String courseInfo = parts[0].replace(" credits", "").replace("(", "").replace(")", "");
            String grade = parts[1];

            String[] courseParts = courseInfo.split(" ");
            String courseName = courseParts[0] + " " + courseParts[1];
            int credits = Integer.parseInt(courseParts[2]);

            sb.append(String.format("%-12s %-10d %s%n", courseName, credits, grade));
        }
        return sb.toString();
    }


    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    public int getTotalCredits() {
        int totalCredits = 0;
        for (Course course : courses) {
            totalCredits += course.getCredits();
        }
        return totalCredits;
    }

    public double getGPA() {
        double totalPoints = 0;
        int totalCredits = getTotalCredits();

        for (Course course : courses) {
            totalPoints += getGradePoint(course.getGrade()) * course.getCredits();
        }

        return (totalCredits == 0) ? 0.0 : totalPoints / totalCredits;
    }

    private double getGradePoint(char grade) {
        switch (grade) {
            case 'A': return 4.0;
            case 'B': return 3.0;
            case 'C': return 2.0;
            case 'D': return 1.0;
            case 'F': return 0.0;
            default: return 0.0;
        }
    }
}