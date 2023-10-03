package string.problems;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class PermutationTest {

    @Test
    public void testGeneratePermutations() {
        String input = "ABC";
        String expectedOutput = "ABC\nACB\nBAC\nBCA\nCBA\nCAB\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        Permutation.generatePermutations(input, 0, input.length() - 1);

        System.setOut(originalOut);

        assertEquals(expectedOutput, outputStream.toString());
    }

    @Test
    public void testSwap() {
        String input = "ABC";
        String swapped = Permutation.swap(input, 0, 1);

        assertEquals("BAC", swapped);
    }

}