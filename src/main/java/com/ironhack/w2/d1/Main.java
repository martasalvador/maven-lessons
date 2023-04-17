package com.ironhack.w2.d1;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Slow Life", 200);
        Book book2 = new Book("Normal People", 300);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);

        Author author = new Author("Sally", "Rooney",books );

        // System.out.println(author);


        //// GSON DEPENDENCY
        Gson gson = new Gson();
        String authorJson = gson.toJson(author); // convierte una list en json
        System.out.println(authorJson);

        Author authorFromJson = gson.fromJson(authorJson, Author.class); // crear objetos a partir de jsons
        System.out.println(authorFromJson);
    }
}
