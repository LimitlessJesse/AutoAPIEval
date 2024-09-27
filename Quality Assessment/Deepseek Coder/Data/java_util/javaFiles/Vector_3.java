import java.util.Vector;

public class Vector_3 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        System.out.println(vector);
        vector.clear();
        System.out.println(vector);
    }
}
