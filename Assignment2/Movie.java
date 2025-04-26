public class Movie {
    private String title;
    private int runningTime;
    private int releaseYear;

    public Movie () {
        this("The Matrix", 136, 1999);
    }

    public Movie(String title, int runningTime, int releaseYear) {
        this.title = title;
        this.runningTime = runningTime;
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return title + " (" + releaseYear + ")" + " (" + runningTime + " minutes)";
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        System.out.println("movie1: " + movie1);
        Movie movie2 = new Movie("Star Wars", 121, 1977);
        System.out.println("movie2: " + movie2);
    }
}
