package math.problems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FindLowestDifferenceTest {
    @Test
    public void testFindLowestDifference() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

        int result = FindLowestDifference.findLowestDifference(array1, array2);

        // The expected lowest difference is 1
        int expected = 1;
        assertEquals(expected, result);

    }
}