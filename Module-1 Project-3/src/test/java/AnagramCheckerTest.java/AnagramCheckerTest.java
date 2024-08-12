package test.java;

import main.java.AnagramChecker;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckerTest {

    @Test
    public void testWithAnagrams() {
        assertTrue(AnagramChecker.areAnagrams("Listen", "Silent"));
        assertTrue(AnagramChecker.areAnagrams("Dormitory", "Dirty room"));
    }

    @Test
    public void testWithNonAnagrams() {
        assertFalse(AnagramChecker.areAnagrams("Hello", "World"));
        assertFalse(AnagramChecker.areAnagrams("Test", "Tess"));
    }

    @Test
    public void testWithSpecialCharacters() {
        assertTrue(AnagramChecker.areAnagrams("A gentleman", "Elegant man!"));
        assertTrue(AnagramChecker.areAnagrams("Clint Eastwood", "Old West Action!"));
    }

    @Test
    public void testWithEmptyAndNullStrings() {
        assertFalse(AnagramChecker.areAnagrams("", ""));
        assertFalse(AnagramChecker.areAnagrams(null, null));
        assertFalse(AnagramChecker.areAnagrams("a", null));
        assertFalse(AnagramChecker.areAnagrams(null, "a"));
    }
}
