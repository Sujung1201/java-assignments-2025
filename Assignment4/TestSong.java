// TestSong
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestSong
{
    public static void main(String[] args)
    {
        System.out.println("Constructors");
        // Test the constructors.
        Song song1 = new Song("Sukiyaki", "Kyu Sakamoto", "3:09");
        Song song2 = new Song();

        System.out.println("song1: " + song1);
        System.out.println("song2: " + song2);

        System.out.println();

        // Check the format of the toString() method.
        System.out.println("toString() Method");
        System.out.println("Correct format? " + song2.toString().equals("\"Song Name\" by John Doe (1:23)"));

        System.out.println();

        System.out.println("Getters and Setters");
        System.out.println("song2.getTitle(): " + song2.getTitle());
        System.out.println("song2.getArtist(): " + song2.getArtist());
        System.out.println("song2.getDuration(): " + song2.getDuration());
        song2.setTitle("Aerodynamic");
        song2.setArtist("Daft Punk");
        song2.setDuration("3:27");
        System.out.println("song2.getTitle(): " + song2.getTitle());
        System.out.println("song2.getArtist(): " + song2.getArtist());
        System.out.println("song2.getDuration(): " + song2.getDuration());
    }
}