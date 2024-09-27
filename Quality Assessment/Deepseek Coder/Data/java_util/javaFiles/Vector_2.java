import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;

public class Vector_2 {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Programming");

        vector.addAll(list);

        System.out.println(vector);
    }
}
