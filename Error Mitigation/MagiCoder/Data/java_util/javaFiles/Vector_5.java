import java.util.Vector;

public class Vector_5 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        System.out.println("Before removing: " + vector);

        // Removing an element
        vector.remove("World");
        System.out.println("After removing: " + vector);
    }
}
