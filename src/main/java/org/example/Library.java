package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {

    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public Book findBookByTitle(String title) {
        if (title == null) {
            throw new IllegalArgumentException("Название книги не может быть пустым");
        }
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        throw new NoSuchElementException("Книга '" + title + "' не найдена в библиотеке");
    }
}
