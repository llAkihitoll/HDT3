import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {
    @Test
    void testMergeSort() {
        int[] arr = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        MergeSort.sort(arr, 0, arr.length - 1);
        assertArrayEquals(expected, arr);
    }
}