package com.ironhack.w2.d1.d2;

import java.util.Objects;

public class Book {
    private long ISBN;
    private String title;
    private String author;
    private int publishYear;

    public Book(long ISBN, String title, String author, int publishYear) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
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

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ISBN == book.ISBN && publishYear == book.publishYear && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, title, author, publishYear);
    }

    /*public static Book getBook(){
        return new Book;
    }*/
}
