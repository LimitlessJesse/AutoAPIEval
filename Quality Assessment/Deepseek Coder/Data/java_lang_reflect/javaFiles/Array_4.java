import java.lang.reflect.Array;

public class Array_4 {
    public static void main(String[] args) {
        Object array = Array.newInstance(String.class, 3);
        Array.set(array, 0, "Hello");
        Array.set(array, 1, "World");
        Array.set(array, 2, "!");

        for (int i = 0; i < Array.getLength(array); i++) {
            System.out.print(Array.get(array, i) + " ");
        }
    }
}
