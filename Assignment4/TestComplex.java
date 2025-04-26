// TestComplex
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestComplex
{
    public static void main(String[] args)
    {
        System.out.println("Constructors");
        // Test the constructors.
        Complex a = new Complex(2.0, 3.0);
        Complex b = new Complex(4.0, 5.0);
        Complex c = new Complex(2.0, -3.0);
        Complex d = new Complex();

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);

        System.out.println();

        // Check the format of the toString() method.
        System.out.println("toString() Method");
        System.out.println("Correct format? " + d.toString().equals("0.0 + 0.0i"));
        System.out.println("Correct format? " + c.toString().equals("2.0 - 3.0i"));

        System.out.println();

        System.out.println("Getters and Setters");
        System.out.println("d.getReal(): " + d.getReal());
        System.out.println("d.getImaginary(): " + d.getImaginary());
        d.setReal(6.0);
        d.setImaginary(7.0);
        System.out.println("d.getReal(): " + d.getReal());
        System.out.println("d.getImaginary(): " + d.getImaginary());

        System.out.println();

        System.out.println("Addition");
        System.out.println("a.add(b): " + a.add(b));
        System.out.println("a.add(d): " + a.add(d));

        System.out.println();

        System.out.println("Subtraction");
        System.out.println("a.subtract(b): " + a.subtract(b));
        System.out.println("a.subtract(d): " + a.subtract(d));

        System.out.println();

        System.out.println("Multiplication");
        System.out.println("a.multiply(b): " + a.multiply(b));
        System.out.println("a.multiply(d): " + a.multiply(d));
    }
}