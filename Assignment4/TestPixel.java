// TestPixel
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestPixel
{
    public static void main(String[] args)
    {
        System.out.println("Constructors");
        // Test the constructors.
        Pixel pixel1 = new Pixel(0, 255, 128);
        Pixel pixel2 = new Pixel();

        System.out.println("pixel1: " + pixel1);
        System.out.println("pixel2: " + pixel2);

        System.out.println();

        // Check the format of the toString() method.
        System.out.println("toString() Method");
        System.out.println("Correct format? " + pixel2.toString().equals("(0, 0, 0)"));

        System.out.println();

        System.out.println("Getters and Setters");
        System.out.println("pixel2.getRed(): " + pixel2.getRed());
        System.out.println("pixel2.getGreen(): " + pixel2.getGreen());
        System.out.println("pixel2.getBlue(): " + pixel2.getBlue());
        pixel2.setRed(255);
        pixel2.setGreen(255);
        pixel2.setBlue(255);
        System.out.println("pixel2.getRed(): " + pixel2.getRed());
        System.out.println("pixel2.getGreen(): " + pixel2.getGreen());
        System.out.println("pixel2.getBlue(): " + pixel2.getBlue());

        System.out.println();

        // Test createRandomPixel().
        System.out.println("createRandomPixel() Method");
        Pixel pixel3 = Pixel.createRandomPixel();
        System.out.println("Random Pixel: " + pixel3);
    }
}