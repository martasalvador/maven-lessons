package com.ironhack.w2.d1.d2;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        //// CHECKED EXCEPTIONS
        readFile("myFile.txt");

        //// CHECKED EXCEPTIONS
        String name = null;
        printLength(name);

        //// THROWS
        int[] sampleArray = null;
        try {
        printArray(sampleArray);
        } catch (NullPointerException e){
            System.out.println("Error: array can't be null");
        }

        //// THROWING EXCEPTIONS
        int a = 35342876;
        int b = -54543423;
        try {
            int result = multiply(a, b);
            System.out.println(result);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            System.out.println("Using long version...");
            long result = multiply((long) a, (long) b);
        }

        //// EQUALS, HASH & TO STRING
        Book book1 = new Book(5342, "Harry Potter", "J.K.Rowling", 1990);
        Book book2 = new Book(542, "Harry Potter", "J.K.Rowling", 1990);

        System.out.println(book1.equals(book2));


        System.out.println("Ha llegado hasta aqui");

    }

    public static void readFile(String fileName) {
        //// TRY...CATCH
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("Error: the file does not exist");
            // e.printStackTrace(); -> para ver todos los pasos del error
        }
    }

    public static void printLength(String myString) {
        try {
            System.out.println(myString.length());
        } catch (NullPointerException e) {
            System.out.println("Error: String is null");
        }
    }

    public static void printArray(int[] array) throws NullPointerException{
        // ponemos throws cuando queremos gestionar el error fuera del método
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int multiply(int a, int b){
        int result = a * b;
        if(result / a != b) {
           throw new IllegalArgumentException("Not valid");
        } return result;
    }

    /* podemos sobrecargar el método llamandolo igual si reciben cosas distintas.
    Se usara uno u otro dependiendo del tipo de numero que reciba */
    public static long multiply(long a, long b){
        return a * b;
    }
}
