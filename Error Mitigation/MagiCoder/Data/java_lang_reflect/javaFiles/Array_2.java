import java.lang.reflect.Array;

public class Array_2 {
    public static void main(String[] args) {
        String[] array = new String[5];
        try {
            int length = Array.getLength(array);
            System.out.println("Length of the array: " + length);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
