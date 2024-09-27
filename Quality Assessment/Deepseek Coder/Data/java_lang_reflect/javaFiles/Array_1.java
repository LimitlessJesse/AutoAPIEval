import java.lang.reflect.Array;

public class Array_1 {
    public static void main(String[] args) {
        int length = 5;
        Class<?> componentType = String.class;

        Object array = Array.newInstance(componentType, length);

        Array.set(array, 0, "Hello");
        Array.set(array, 1, "World");
        Array.set(array, 2, "This");
        Array.set(array, 3, "Is");
        Array.set(array, 4, "Java");

        for (int i = 0; i < Array.getLength(array); i++) {
            System.out.print(Array.get(array, i) + " ");
        }
    }
}
