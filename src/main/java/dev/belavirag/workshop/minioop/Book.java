package dev.belavirag.workshop.minioop;

public class Book {
    private String title, author;
    private boolean available;
    private Person person;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.available = true;
    }

    public Person showPerson() {
        return this.person;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setPerson(Person person) {
        this.available = person == null;
        this.person = person;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", available=" + available +
                '}';
    }
}
