package org.example;

public class Book {
    private String title;
    private int releaseYear;
    private Author author;

    public Book(String title, int releaseYear, Author author) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        String patronymicPart = "";
        if (author.getPatronymic() != null && !author.getPatronymic().isEmpty()) {
            patronymicPart = " " + author.getPatronymic().charAt(0) + ".";
        }

        String authorName = author.getLastName() + " " +
                author.getFirstName().charAt(0) + "." +
                patronymicPart;

        return String.format("\"%s\" (Год: %d, Автор: %s)",
                title,
                releaseYear,
                authorName);
    }
}
