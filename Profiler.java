class Profiler {
    public static void measureTime(Runnable sortMethod, String algorithmName) {
        long startTime = System.nanoTime();
        sortMethod.run();
        long endTime = System.nanoTime();
        System.out.println(algorithmName + " took " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}