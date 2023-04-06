package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 464);
        Book book2 = new Book("Java Concurrency in Practice", 464);
        Book book3 = new Book("Test Driven Development: By Example", 242);
        Book book4 = new Book("Java: The Complete Reference, Ninth Edition",  1312);
        Book[] library = new Book[4];
        library[0] = book1;
        library[1] = book2;
        library[2] = book3;
        library[3] = book4;
        for (int i = 0; i < library.length; i++) {
            System.out.print(library[i].getNameBook() + "; ");
        }
        System.out.println();
        Book tmp = library[0];
        library[0] = library[3];
        library[3] = tmp;
        for (int i = 0; i < library.length; i++) {
            System.out.print(library[i].getNameBook() + "; ");
        }
        System.out.println();
        for (int i = 0; i < library.length; i++) {
            if ("Clean code".equals(library[i].getNameBook())) {
                System.out.print(library[i].getNameBook());
            }
        }
    }
}
