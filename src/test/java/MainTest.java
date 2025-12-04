import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    //Aufgabe 1
    @Test
    void isPositiveTest() {
        assertTrue(Main.isPositive(1));
        assertFalse(Main.isPositive(-1));
    }

    @Test
    void multiplyTest() {
        assertEquals(4, Main.multiply(2, 2));
        assertEquals(-4, Main.multiply(-2, 2));
    }

    //Aufgabe 2
    @Test
    void getFirstLetterTest() {
        assertNull(Main.getFirstLetter(""));
        assertNull(Main.getFirstLetter(null));
        assertNotNull(Main.getFirstLetter("AB"));
    }

    @Test
    void divideTest() {
        assertEquals(1, Main.divide(2, 2));
        assertThrows(IllegalArgumentException.class, () -> Main.divide(1, 0));
    }

    //Aufgabe 3
    @Test
    void isPrimeTest() {
        assertTrue(Main.isPrime(2));
        assertFalse(Main.isPrime(-1));
        assertFalse(Main.isPrime(22));
        assertTrue(Main.isPrime(37));
        assertTrue(Main.isPrime(7));
    }
}
