import java.lang.reflect.Array;

public class Array_3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Object value = Array.get(array, 2);
        System.out.println("Value at index 2: " + value);
    }
}
