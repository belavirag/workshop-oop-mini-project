package dev.belavirag.workshop.minioop;

import java.util.Arrays;

public class Person {
    private int personId;
    private String firstName, lastName;

    private Book[] books;

    public Person(int personId, String firstName, String lastName) {
        this.personId = personId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = new Book[0];
    }

    public void loanBook(Book book) {
        if (arrayContains(books, book) || !book.isAvailable()) {
            throw new IllegalArgumentException("Book already loaned!");
        }

        book.setPerson(this);
        books = addToArray(books, book);
    }

    private boolean arrayContains(Book[] books, Book book) {
        for (Book b : books) {
            if (b == book) {
                return true;
            }
        }

        return false;
    }

    private Book[] addToArray(Book[] arr, Book newBook) {
        Book[] copyOf = Arrays.copyOf(arr, arr.length + 1);
        copyOf[copyOf.length - 1] = newBook;
        return copyOf;
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
        return Arrays.toString(books);
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + Arrays.toString(books) +
                '}';
    }
}
