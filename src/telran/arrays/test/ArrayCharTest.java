package telran.arrays.test;

import org.junit.jupiter.api.Test;
import telran.arrays.ArrayChar;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayCharTest {

    @Test
    void compareToTest() {
        char[] ar1 = {'1', '2', '3'};
        char[] ar2 = {'9'};
        char[] ar3 = {'1', '2', '3'};
        char[] ar4 = {'1', '2', '4', 'd'};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        ArrayChar arrayChar2 = new ArrayChar(ar2);
        ArrayChar arrayChar3 = new ArrayChar(ar3);
        ArrayChar arrayChar4 = new ArrayChar(ar4);

        assertEquals(8, arrayChar2.compareTo(arrayChar1));
        assertEquals(-8, arrayChar1.compareTo(arrayChar2));
        assertEquals(1, new ArrayChar(new char[]{'a', 'a'}).compareTo(new ArrayChar(new char[]{'a'})));
        assertEquals(-1, new ArrayChar(new char[]{'a'}).compareTo(new ArrayChar(new char[]{'a', 'a'})));
        assertEquals(0, arrayChar1.compareTo(arrayChar3));
        assertEquals(-1, arrayChar1.compareTo(arrayChar4));
        assertEquals(1, arrayChar4.compareTo(arrayChar1));
        //
    }

    @Test
    void indexOfTest() {
        char[] ar1 = {'1', '2', '3'};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        assertEquals(1, arrayChar1.indexOf('2'));
        assertEquals(-1, arrayChar1.indexOf('9'));
        assertEquals(-1, arrayChar1.indexOf('9'));
    }

    @Test
    void lastIndexOfTest() {
        char[] ar1 = {'1', '2', '3', '2'};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        assertEquals(3, arrayChar1.lastIndexOf('2'));
        assertEquals(-1, arrayChar1.lastIndexOf('9'));
    }

    //    1.1
    @Test
    void countTest() {
        char[] ar = {'a', 'b', '3', 'a'};
        char[] ar1 = {};
        ArrayChar arrayChar = new ArrayChar(ar);
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        assertEquals(2, arrayChar.count('a'));
        assertEquals(1, arrayChar.count('3'));
        assertEquals(0, arrayChar.count('c'));
        assertEquals(0, arrayChar1.count('b'));
    }

    //    1.2
    @Test
    void compareToIgnoreCaseTest() {
        char[] ar1 = {'a', 'b', '3', 'a'};
        char[] ar2 = {'a', 'B', '3', 'A'};
        char[] ar3 = {'a', 'B', '3', 'V'};
        char[] ar4 = {};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        ArrayChar arrayChar2 = new ArrayChar(ar2);
        ArrayChar arrayChar3 = new ArrayChar(ar3);
        ArrayChar arrayChar4 = new ArrayChar(ar4);

        assertEquals(0, arrayChar1.compareToIgnoreCase(arrayChar2));
        assertEquals(11, arrayChar1.compareToIgnoreCase(arrayChar3));
        assertEquals(4, arrayChar1.compareToIgnoreCase(arrayChar4));
        assertEquals(-4, arrayChar4.compareToIgnoreCase(arrayChar1));
    }

    //    1.3
    @Test
    void containsTest() {
        char[] ar1 = {'a', 'b', '3', 'a'};
        ArrayChar arrayChar = new ArrayChar(ar1);
        assertTrue(arrayChar.contains('3'));
        assertFalse(arrayChar.contains('A'));
    }

    //    1.4
    @Test
    void equalsTest() {
        char[] ar1 = {'a', 'b', '3', 'a'};
        char[] ar2 = {'a', 'b', '3', 'a'};
        char[] ar3 = {'a', 'B', '3', 'A'};
        char[] ar4 = {};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        ArrayChar arrayChar2 = new ArrayChar(ar2);
        ArrayChar arrayChar3 = new ArrayChar(ar3);
        ArrayChar arrayChar4 = new ArrayChar(ar4);

        assertTrue(arrayChar1.equals(arrayChar2));
        assertTrue(arrayChar1.equals(arrayChar2));
        assertFalse(arrayChar2.equals(arrayChar3));
        assertFalse(arrayChar2.equals(arrayChar4));
    }

    //    1.5
    @Test
    void equalsIgnoreCaseTest() {
        char[] ar1 = {'a', 'b', '3', 'a'};
        char[] ar2 = {'a', 'b', '3', 'a'};
        char[] ar3 = {'a', 'B', '3', 'A'};
        char[] ar4 = {};
        ArrayChar arrayChar1 = new ArrayChar(ar1);
        ArrayChar arrayChar2 = new ArrayChar(ar2);
        ArrayChar arrayChar3 = new ArrayChar(ar3);
        ArrayChar arrayChar4 = new ArrayChar(ar4);

        assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
        assertTrue(arrayChar1.equalsIgnoreCase(arrayChar2));
        assertTrue(arrayChar2.equalsIgnoreCase(arrayChar3));
        assertFalse(arrayChar2.equalsIgnoreCase(arrayChar4));
    }

}
