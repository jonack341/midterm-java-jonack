package string.problems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    public void testIsPalindromeWithPalindromeWord() {
        String palindromeWord = "racecar";
        assertTrue(Palindrome.isPalindrome(palindromeWord));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeWord() {
        String nonPalindromeWord = "hello";
        assertFalse(Palindrome.isPalindrome(nonPalindromeWord));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        String emptyString = "";
        assertTrue(Palindrome.isPalindrome(emptyString));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        String singleCharacter = "a";
        assertTrue(Palindrome.isPalindrome(singleCharacter));
    }

}