// Main.java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] data = generateRandomNumbers(3000);
        saveToFile(data, "numbers.txt");
        
        int[] numbers = readFromFile("numbers.txt");
        runSortingAlgorithms(numbers);
        runSortingAlgorithms(numbers.clone()); // Ejecutar sobre datos ordenados
    }
    
    private static int[] generateRandomNumbers(int size) {
        Random rand = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        return numbers;
    }
    
    private static void saveToFile(int[] numbers, String filename) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        for (int num : numbers) {
            writer.write(num + "\n");
        }
        writer.close();
    }
    
    private static int[] readFromFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<Integer> numberList = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) {
            numberList.add(Integer.parseInt(line));
        }
        reader.close();
        return numberList.stream().mapToInt(i -> i).toArray();
    }
    
    private static void runSortingAlgorithms(int[] data) {
        int[] copy;
        
        copy = data.clone(); measureTime(() -> InsertionSort.sort(copy), "Insertion Sort");
        copy = data.clone(); measureTime(() -> MergeSort.sort(copy, 0, copy.length - 1), "Merge Sort");
        copy = data.clone(); measureTime(() -> QuickSort.sort(copy, 0, copy.length - 1), "Quick Sort");
        copy = data.clone(); measureTime(() -> RadixSort.sort(copy), "Radix Sort");
        copy = data.clone(); measureTime(() -> BucketSort.sort(copy), "Bucket Sort");
        copy = data.clone(); measureTime(() -> CountingSort.sort(copy), "Counting Sort");
    }
    
    private static void measureTime(Runnable sortMethod, String algorithmName) {
        long startTime = System.nanoTime();
        sortMethod.run();
        long endTime = System.nanoTime();
        System.out.println(algorithmName + " took " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
