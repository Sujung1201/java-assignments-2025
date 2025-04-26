// TestTranscript
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestTranscript
{
    public static void main(String[] args)
    {
        System.out.println("Constructor");
        // Test the constructors.
        Course[] courses = {
                new Course("CS 1100", 3, 'A'),
                new Course("CS 1110", 3, 'B'),
                new Course("CS 1000", 3, 'C'),
                new Course("CS 2400", 3, 'C')
        };
        Transcript t1 = new Transcript(courses);

        System.out.println("t1:\n" + t1);

        System.out.println();

        // Test getTotalCredits().
        System.out.println("getTotalCredits() Method");
        System.out.println("Total Credits: " + t1.getTotalCredits());

        System.out.println();

        // Test getGPA().
        System.out.println("getGPA() Method");
        System.out.println("GPA: " + t1.getGPA());
    }
}