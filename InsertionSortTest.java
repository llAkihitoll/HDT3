import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class InsertionSortTest {
    @Test
    void testInsertionSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        InsertionSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}