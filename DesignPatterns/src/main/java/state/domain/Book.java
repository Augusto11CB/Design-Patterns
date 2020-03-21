package state.domain;

public class Book {

    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        super();
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}

