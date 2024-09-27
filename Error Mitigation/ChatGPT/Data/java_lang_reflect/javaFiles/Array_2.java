import java.lang.reflect.Array;

public class Array_2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int length = Array.getLength(array);
        System.out.println("Length of the array: " + length);
    }
}
