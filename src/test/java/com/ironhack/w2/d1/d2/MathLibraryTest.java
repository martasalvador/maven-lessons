package com.ironhack.w2.d1.d2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathLibraryTest {

    @Test
    void multiply_smallInt_IllegalArgumentsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            MathLibrary.multiply(376, 43);
        });
    }

    @Test
    void multiply_longInt(){
        assertEquals(543, MathLibrary.multiply(543, 6543));
    }
}