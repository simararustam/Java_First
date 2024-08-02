public class Book {
    String title;
    Author author;
    int publicationYear;

    public Book(String title, Author author, int publicationYear ) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return "Book: " + title +
                " (" + author.getName() +
                ", PublicationYear:" + publicationYear +
                '}';
    }
}
