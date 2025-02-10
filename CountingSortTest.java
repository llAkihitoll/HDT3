import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountingSortTest {
    @Test
    void testCountingSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        CountingSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}