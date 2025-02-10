class BucketSort {
    public static void sort(int[] arr) {
        int max = Arrays.stream(arr).max().orElse(1);
        int bucketCount = Math.max(1, max / 10);
        List<Integer>[] buckets = new List[bucketCount];
        for (int i = 0; i < bucketCount; i++) buckets[i] = new ArrayList<>();
        for (int num : arr) buckets[num / 10].add(num);
        for (List<Integer> bucket : buckets) Collections.sort(bucket);
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) arr[index++] = num;
        }
    }
}