import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {
    @Test
    void testQuickSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        QuickSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}
