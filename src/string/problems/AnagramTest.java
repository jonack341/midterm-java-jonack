package string.problems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    public void testAreAnagrams() {
        // Test cases with anagrams
        assertTrue(Anagram.areAnagrams("CAT", "ACT"));
        assertTrue(Anagram.areAnagrams("ARMY", "MARY"));
        assertTrue(Anagram.areAnagrams("EARTH", "HEART"));

        // Test cases with non-anagrams
        assertFalse(Anagram.areAnagrams("hello", "world"));
        assertFalse(Anagram.areAnagrams("good", "dog"));
        assertFalse(Anagram.areAnagrams("listen", "silent"));
    }

}