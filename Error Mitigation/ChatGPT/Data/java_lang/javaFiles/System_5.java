import java.util.Arrays;

public class System_5 {
    public static void main(String[] args) {
        int[] srcArray = {1, 2, 3, 4, 5};
        int[] destArray = new int[5];
        
        System.arraycopy(srcArray, 0, destArray, 0, 5);
        
        System.out.println("Source Array: " + Arrays.toString(srcArray));
        System.out.println("Destination Array: " + Arrays.toString(destArray));
    }
}
