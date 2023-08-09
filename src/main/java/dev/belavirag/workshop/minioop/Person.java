package dev.belavirag.workshop.minioop;

import java.util.ArrayList;

public class Person {
    private int personId;
    private String firstName, lastName;

    private ArrayList<Book> books;

    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new ArrayList<>();
    }

    public void loanBook(Book book) {
        if (books.contains(book) || !book.isAvailable()) {
            throw new IllegalArgumentException("Book already loaned!");
        }

        book.setPerson(this);
        books.add(book);
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String displayBooks() {
        return books.toString();
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }
}
