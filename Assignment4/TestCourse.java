// TestCourse
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestCourse
{
    public static void main(String[] args)
    {
        System.out.println("Constructors");
        // Test the constructors.
        Course c1 = new Course("CS 1100", 3, 'F');
        Course c2 = new Course("CS 1110", 3, 'A');
        Course c3 = new Course();

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);

        System.out.println();

        // Check the format of the toString() method.
        System.out.println("toString() Method");
        System.out.println("Correct format? " + c3.toString().equals("ABC 0000 (3 credits), F"));

        System.out.println();

        System.out.println("Getters and Setters");
        System.out.println("c3.getNumber(): " + c3.getNumber());
        System.out.println("c3.getCredits(): " + c3.getCredits());
        System.out.println("c3.getGrade(): " + c3.getGrade());
        c3.setNumber("MATH 1151");
        c3.setCredits(5);
        c3.setGrade('C');
        System.out.println("c3.getNumber(): " + c3.getNumber());
        System.out.println("c3.getCredits(): " + c3.getCredits());
        System.out.println("c3.getGrade(): " + c3.getGrade());
    }
}