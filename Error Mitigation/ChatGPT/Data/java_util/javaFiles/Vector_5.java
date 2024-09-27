import java.util.Vector;

public class Vector_5 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Orange");

        int index = vector.indexOf("Banana");
        System.out.println("Index of 'Banana': " + index);

        index = vector.indexOf("Grapes");
        System.out.println("Index of 'Grapes': " + index);
    }
}
