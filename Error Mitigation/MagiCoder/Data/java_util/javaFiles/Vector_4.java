import java.util.Vector;

public class Vector_4 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        System.out.println("Before set: " + vector);
        vector.set(1, "Java");
        System.out.println("After set: " + vector);
    }
}
