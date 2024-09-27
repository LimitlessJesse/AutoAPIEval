import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        boolean result = vector.add("Hello");
        System.out.println(vector);
        System.out.println("Add operation was successful: " + result);
    }
}
