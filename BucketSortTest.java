import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BucketSortTest {
    @Test
    void testBucketSort() {
        int[] arr = {42, 32, 33, 52, 37, 47, 51};
        int[] expected = {32, 33, 37, 42, 47, 51, 52};
        BucketSort.sort(arr);
        assertArrayEquals(expected, arr);
    }
}