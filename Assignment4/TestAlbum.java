// TestAlbum
// Add this file to your IntelliJ project.
// Do not modify this file.

public class TestAlbum
{
    public static void main(String[] args)
    {
        // Test the constructor.
        System.out.println("Constructor");
        Song[] tracks = {
                new Song("One More Time", "Daft Punk", "5:20"),
                new Song("Aerodynamic", "Daft Punk", "3:27"),
                new Song("Digital Love", "Daft Punk", "4:58")
        };
        Album album1 = new Album("Discovery", "Daft Punk", 2001, tracks);

        System.out.println("album1:\n" + album1);

        System.out.println();

        System.out.println("Getters and Setters");
        System.out.println("album1.getTitle(): " + album1.getTitle());
        System.out.println("album1.getArtist(): " + album1.getArtist());
        System.out.println("album1.getYear(): " + album1.getYear());
    }
}