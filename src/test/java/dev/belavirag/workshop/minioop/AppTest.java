package dev.belavirag.workshop.minioop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    Person getExamplePerson() {
        return new Person(1, "Test", "Tester");
    }

    Book getExampleBook() {
        return new Book("Test Title", "Someone");
    }

    @Test
    void lend() {
        Person p = getExamplePerson();
        Book b = getExampleBook();

        p.loanBook(b);
        assertEquals(p, b.showPerson());
    }

    @Test
    void isAvailable() {
        Person p = getExamplePerson();
        Book b = getExampleBook();
        p.loanBook(b);

        assertFalse(b.isAvailable());
    }
}