import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {
        // Create an array of integers
        Integer[] numbers = {5, 9, 3, 1, 2};
        
        // Print the unsorted array
        System.out.println("Unsorted array: " + Arrays.toString(numbers));
        
        // Sort the array
        Arrays.sort(numbers);
        
        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
