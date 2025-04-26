public class Book {
    private String title;
    private String author;
    private long isbn;

    public Book() {
        this("The Art of War", "Sun Tzu", 1111111111);
    }

    public Book(String title, String author, long isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return '"' + title + "\" by " + author + " (" + isbn + ")";
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public long getISBN() {
        return isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setISBN(long isbn) {
        this.isbn = isbn;
    }

}
