package string.problems;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DuplicateWordTest {

    @Test
    public void testDuplicateWordsAndAverageLength() {
        String input = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String expectedOutput = "Duplicate words and their occurrences:\njava: 3 times\nis: 3 times\n"
                + "average: 2 times\nlanguage: 1 times\nalso: 1 times\nprogramming: 1 times\n"
                + "widely: 1 times\nused: 1 times\nof: 1 times\nindonesia: 1 times\n\nAverage word length: 5.0\n";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        DuplicateWord.main(new String[]{});

        System.setOut(originalOut);

        assertEquals(expectedOutput, outputStream.toString());
    }
}