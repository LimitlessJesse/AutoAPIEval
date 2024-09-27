import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Comparator;

public class CopyOnWriteArrayList_17 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");

        // Sort the list in ascending order
        list.sort(Comparator.naturalOrder());

        // Print the sorted list
        System.out.println(list);
    }
}
