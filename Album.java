public class Album {
    private String title;
    private String artist;
    private int year;
    private Song[] tracks;

    public Album(String title, String artist, int year, Song[] tracks) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(title).append("\n").append(artist).append("\n").append(year).append("\n");

        for (int i = 0; i < tracks.length; i++) {
            sb.append((i + 1)).append(". ")
                    .append(tracks[i].getTitle()).append(" (")
                    .append(tracks[i].getDuration()).append(")\n");
        }
        return sb.toString();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public Song[] getTracks() {
        return tracks;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTracks(Song[] tracks) {
        this.tracks = tracks;
    }
}
