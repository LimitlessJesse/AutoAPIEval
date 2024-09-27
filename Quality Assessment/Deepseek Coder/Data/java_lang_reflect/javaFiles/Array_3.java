import java.lang.reflect.Array;

public class Array_3 {
    public static void main(String[] args) {
        Object array = Array.newInstance(String.class, 3);
        Array.set(array, 0, "Hello");
        Array.set(array, 1, "World");
        Array.set(array, 2, "!");

        String firstElement = (String) Array.get(array, 0);
        String secondElement = (String) Array.get(array, 1);
        String thirdElement = (String) Array.get(array, 2);

        System.out.println(firstElement + " " + secondElement + " " + thirdElement);
    }
}
