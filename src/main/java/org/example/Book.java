package org.example;

public class Book {
    private String title;
    private int releaseDate;
    private Author author;

    public Book(String title, int releaseDate, Author author) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название = '" + title + "'" +
                ", Дата выхода = " + releaseDate +
                ", " + author;
    }
}
