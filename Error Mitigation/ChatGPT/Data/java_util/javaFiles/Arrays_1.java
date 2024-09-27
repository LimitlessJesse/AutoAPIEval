import java.util.Arrays;

public class Arrays_1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        
        System.out.println("Before sorting: " + Arrays.toString(arr));
        
        Arrays.sort(arr);
        
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
