package org.example;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Author pushkin = new Author("Александр", "Пушкин", "Сергеевич");
        Author chehov = new Author("Антон", "Чехов", "Павлович");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book book1 = new Book("Сказка о царе Салтане", 1831, pushkin);
        Book book2 = new Book("Палата №6", 1892, chehov);
        Book book3 = new Book("1984", 1949, orwell);

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);


        String[] titles = {"", "Палата №6", "несуществующая книга"};

        for (String title : titles) {
            try {
                library.printBookByTitle(title);
            } catch (NullPointerException e) {
                System.out.println("Ошибка: Название книги не может быть null");
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: Название книги не может быть пустым");
            }
        }
    }
}