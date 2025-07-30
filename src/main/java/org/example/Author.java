package org.example;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Author {

    private String firstName;
    private String lastName;
    private String patronymic;

    public Author(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        String fullName = Stream.of(firstName, patronymic, lastName)
                .filter(Objects::nonNull)
                .collect(Collectors.joining(" "));
        return "Автор = '" + fullName + "'";
    }
    }


