import java.lang.reflect.Array;

public class Array_2 {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "Hello";
        array[1] = "World";
        array[2] = "This";
        array[3] = "Is";
        array[4] = "Java";

        int length = Array.getLength(array);
        System.out.println("Length of the array: " + length);
    }
}
