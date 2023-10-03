package string.problems;
import org.junit.jupiter.api.Test;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class DetermineLargestWordTest {
    @Test
    public void testFindTheLargestWord() {
        String input = "Human brain is a biological learning machine";
        Map<Integer, String> result = DetermineLargestWord.findTheLargestWord(input);

        assertEquals("biological", result.get(10));
        assertEquals("machine", result.get(7));
        assertEquals("learning", result.get(8));
        assertEquals("Human", result.get(5));
        assertEquals("brain", result.get(5));
    }

}