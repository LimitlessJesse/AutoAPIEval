import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        int[] arr = {4, 2, 9, 5, 1, 7};

        // Calling the sort method to sort the array
        Arrays.sort(arr);

        // Printing the sorted array
        System.out.println("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
