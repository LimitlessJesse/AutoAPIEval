import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        String key = "Cherry";
        int result = Arrays.binarySearch(arr, key);
        if (result < 0) {
            System.out.println(key + " is not found in the array");
        } else {
            System.out.println(key + " is found at index " + result);
        }
    }
}
