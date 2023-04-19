package com.ironhack.w2.d1.d2;

public class MathLibrary {
    public static int multiply(int a, int b){
        int result = a * b;
        if(result / a != b) {
            throw new IllegalArgumentException("Not valid");
        } return result;
    }

}
