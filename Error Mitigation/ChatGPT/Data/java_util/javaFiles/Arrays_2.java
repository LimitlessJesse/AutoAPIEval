import java.util.Arrays;

public class Arrays_2 {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int key = 6;
        
        int index = Arrays.binarySearch(arr, key);
        
        if (index >= 0) {
            System.out.println("Element found at index: " + index);
        } else {
            int insertionPoint = -(index) - 1;
            System.out.println("Element not found. Insertion point would be: " + insertionPoint);
        }
    }
}
