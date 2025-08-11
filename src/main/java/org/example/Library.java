package org.example;
import java.util.*;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Optional<Book> findBookByTitle(String title) {
        Objects.requireNonNull(title, "Название книги не может быть null");
        if (title.isBlank()) {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
        if (books == null) {
            return Optional.empty();
        }
        for (Book book : books) {
            if (book != null && title.equalsIgnoreCase(book.getTitle())) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }

    public void printBookByTitle(String title) {
        Optional<Book> optionalBook = findBookByTitle(title);
        if (optionalBook.isPresent()) {
            System.out.println("Найдена книга: " + optionalBook.get().toString());
        } else {
            System.out.println("Книга не найдена");
        }
    }
}
