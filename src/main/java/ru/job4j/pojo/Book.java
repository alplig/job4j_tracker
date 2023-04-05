package ru.job4j.pojo;

public class Book {
    private String name;
    private int pages;

    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getNameBook() {
        return name;
    }

    public void setNameBook(String name) {
        this.name = name;
    }

    public int getPagesBook() {
        return pages;
    }

    public void setPagesBook(int pages) {
        this.pages = pages;
    }
}
