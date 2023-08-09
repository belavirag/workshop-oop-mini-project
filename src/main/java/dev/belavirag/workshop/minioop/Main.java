package dev.belavirag.workshop.minioop;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Test Book 1", "Someone");
        Book book2 = new Book("Test Book 2", "Someone");

        Person reader1 = new Person(1, "Some", "One");
        Person reader2 = new Person(2, "One", "Some");

        System.out.println(reader1);
        System.out.println(book1);
        reader1.loanBook(book1);
        System.out.println("-----------------------");
        System.out.println(book1);
        System.out.println(reader1);
    }
}