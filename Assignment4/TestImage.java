// TestImage
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestImage
{
    public static void main(String[] args)
    {
        // Test the constructor.
        System.out.println("Constructor");
        Pixel[][] data = new Pixel[4][3];

        for (int i = 0; i < data.length; i++)
        {
            for (int j = 0; j < data[i].length; j++)
            {
                data[i][j] = new Pixel();
            }
        }
        Image image1 = new Image(4, 3, data);

        System.out.println("image1:\n" + image1);


        System.out.println("Getters and Setters");
        System.out.println("image1.getWidth(): " + image1.getWidth());
        System.out.println("image1.getArtist(): " + image1.getHeight());

        System.out.println();

        System.out.println("setPixel() Method");
        Pixel pixel = new Pixel(1, 1, 1);
        image1.setPixel(pixel, 2, 1);
        System.out.println("image1:\n" + image1);
    }
}