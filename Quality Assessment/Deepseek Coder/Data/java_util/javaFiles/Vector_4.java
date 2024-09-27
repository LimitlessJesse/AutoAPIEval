import java.util.Vector;

public class Vector_4 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        System.out.println(vector.contains("Hello")); // prints: true
        System.out.println(vector.contains("World")); // prints: false
    }
}
