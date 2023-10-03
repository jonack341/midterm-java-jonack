package math.problems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindMissingNumberTest {

    @Test
    public void testFindMissingNumber() {
        int[] array = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = 10;

        int result = FindMissingNumber.findMissingNumber(array, n);

        // The expected missing number is 9
        int expected = 9;
        assertEquals(expected, result);
    }

}