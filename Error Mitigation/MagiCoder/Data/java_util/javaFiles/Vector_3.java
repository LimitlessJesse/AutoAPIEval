import java.util.Vector;

public class Vector_3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");

        // Get the element at index 0
        String element = vector.get(0);
        System.out.println(element);  // Output: Hello
    }
}
