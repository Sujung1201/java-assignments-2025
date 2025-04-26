public class Song {
    private String title;
    private String artist;
    private String duration;

    public Song(String title, String artist, String duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public Song() {
        this("Song Name", "John Doe", "1:23");
    }

    @Override
    public String toString() {
        return '"' + title + "\" by " + artist + " (" + duration + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
