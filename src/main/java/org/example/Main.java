package org.example;

public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Александр", "Пушкин", "Сергеевич");
        Author chehov = new Author("Антон", "Чехов", "Павлович");
        Author orwell = new Author("Джордж", "Оруэлл");

        Book book1 = new Book("Сказка о царе Салтане", 1831, pushkin);
        Book book2 = new Book("Палата №6", 1892, chehov);
        Book book3 = new Book("1984", 1949, orwell);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        Book foundBook1 = library.findBookByTitle("Сказка о царе Салтане");
            System.out.println("Найдена книга: " + foundBook1);

        Book foundBook3 = library.findBookByTitle("1984");
        System.out.println("Найдена книга: " + foundBook3);
    }

    }