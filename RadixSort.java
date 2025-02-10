class RadixSort {
    public static void sort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(0);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            CountingSort.sortByDigit(arr, exp);
        }
    }
}