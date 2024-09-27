import java.lang.reflect.Array;

public class Array_4 {
    public static void main(String[] args) {
        int[] array = new int[5];
        
        try {
            Array.set(array, 2, 10);
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        } catch (IllegalArgumentException | ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }
}
