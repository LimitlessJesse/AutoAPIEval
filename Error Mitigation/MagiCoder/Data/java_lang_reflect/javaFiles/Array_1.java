import java.lang.reflect.Array;

public class Array_1 {
    public static void main(String[] args) {
        try {
            Object array = Array.newInstance(String.class, 3);
            Array.set(array, 0, "Hello");
            Array.set(array, 1, "World");
            Array.set(array, 2, "Java");

            for (int i = 0; i < Array.getLength(array); i++) {
                System.out.println(Array.get(array, i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
