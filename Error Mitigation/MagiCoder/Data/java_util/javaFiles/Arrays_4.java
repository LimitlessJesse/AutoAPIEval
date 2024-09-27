import java.util.Arrays;

public class Arrays_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        int result = Arrays.binarySearch(array, key);
        if (result < 0) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}
