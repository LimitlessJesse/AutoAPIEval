import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

public class AbstractCollection_4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        AbstractCollection<String> collection = list;

        System.out.println(collection.contains("Hello"));  // Outputs: true
        System.out.println(collection.contains("Java"));  // Outputs: false
    }
}
