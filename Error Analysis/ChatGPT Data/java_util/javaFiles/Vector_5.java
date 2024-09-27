import java.util.Vector;

public class Vector_5 {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(1);
        vector.add(2);
        vector.add(3);

        System.out.println("Initial Vector: " + vector);

        setSize(vector, 5);

        System.out.println("Vector after resizing: " + vector);
    }

    public static void setSize(Vector<Integer> vector, int newSize) {
        vector.setSize(newSize);
    }
}
