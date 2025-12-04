import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.*;

public class TDD__Test {
    //Aufgabe 1
    @Test
    void sumTest(){
        assertEquals(4, TDD.sum(1,3));
    }
    //Aufgabe 2
    @Test
    void isEvenTest(){
        assertTrue(TDD.isEven(4));
        assertFalse(TDD.isEven(3));
    }

    //Aufgabe 3
    @Test
    void getFirstCharacterTest(){
        assertEquals('H', TDD.getFirstCharacter("Hallo"));
    }

    //Aufgabe 4
    @Test
    void reverseStringTest(){
        assertEquals("avaJ",TDD.reverseString("Java"));
    }

    //Aufgabe 5
    @Test
    void isPalindromeTest(){
        assertTrue(TDD.isPalindrome("Otto"));
        assertFalse(TDD.isPalindrome("Peter"));
        assertTrue(TDD.isPalindrome("Rentner"));
    }

    //Aufgabe 6
    @Test
    void countVowelsTest(){
        assertEquals(2,TDD.countVowels("Hallo"));
    }

    //Aufgabe 7
    @Test
    void factorialTest(){
        assertEquals(1,TDD.factorial(0));
        assertEquals(120,TDD.factorial(5));
    }

    //Aufgabe 8
    @Test
    void fibonacciTest(){
        assertEquals(1,TDD.fibonacci(0));
        assertEquals(1,TDD.fibonacci(1));
        assertEquals(1,TDD.fibonacci(2));
        assertEquals(8,TDD.fibonacci(6));
    }

    //Aufgabe 9
    @Test
    void mergeArrayTest(){

        assertArrayEquals(new int[]{1,2,3,4,5},TDD.mergeArrays(new int[]{1, 2},new int[]{3,4,5}));
    }
}
