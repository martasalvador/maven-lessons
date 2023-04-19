package com.ironhack.w2.d1;

import com.ironhack.w2.d1.d1.Author;
import com.ironhack.w2.d1.d1.Book;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    public static List<Book> books;
    public static Author author;

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before all se ejecuta antes que nada");

        books = new ArrayList<>();
        books.add(new Book("Normal People", 200));
        books.add(new Book("Conversations with friends", 300));
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before Each se ejecuta antes de cada test");

        author = new Author("Sally", "Rooney", books);
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each después de cada test");
    }

    @Test
    void getBookListSize() {

        int bookListSize = author.getBookListSize();
        System.out.println("Book List Size: " + bookListSize);

        assertEquals(2, bookListSize);
    }

    @Test
    void getFullName() {
        String fullName = author.getFullName();
        System.out.println(fullName);

        assertEquals("Sally Rooney", fullName);
    }

    @Test
    void bookListToArray() {
        Book[] bookArray = {
                new Book("Normal People", 200),
                new Book("Conversations with friends", 300)
        };
        // assertArrayEquals(bookArray, author.bookListToArray()); -> no sirve para comprobar si el contenido el =
        System.out.println(Arrays.toString(bookArray));
        System.out.println(Arrays.toString(author.bookListToArray()));

        // Comprobar si dos arrays son iguales
        assertEquals(Arrays.toString(bookArray), Arrays.toString(author.bookListToArray()));
    }
}