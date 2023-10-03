package math.problems;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    public void testCalculateFactorialRecursive() {
        assertEquals(1, Factorial.calculateFactorialRecursive(0));
        assertEquals(1, Factorial.calculateFactorialRecursive(1));
        assertEquals(120, Factorial.calculateFactorialRecursive(5));
        assertEquals(362880, Factorial.calculateFactorialRecursive(9));
    }

    @Test
    public void testCalculateFactorialIterative() {
        assertEquals(1, Factorial.calculateFactorialIterative(0));
        assertEquals(1, Factorial.calculateFactorialIterative(1));
        assertEquals(120, Factorial.calculateFactorialIterative(5));
        assertEquals(362880, Factorial.calculateFactorialIterative(9));
    }
}