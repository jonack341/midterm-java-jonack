package math.problems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LowestNumberTest {    @Test
public void testFindLowestNumber() {
    int[] array = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
    int lowestNumber = LowestNumber.findLowestNumber(array);
    assertEquals(5, lowestNumber);
}
}