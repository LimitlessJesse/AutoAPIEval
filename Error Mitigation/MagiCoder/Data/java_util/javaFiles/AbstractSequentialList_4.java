import java.util.AbstractSequentialList;
import java.util.ArrayList;
import java.util.List;

public class AbstractSequentialList_4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("Original list: " + list);

        // Remove the element at index 0
        String removedElement = ((AbstractSequentialList<String>) list).remove(0);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated list: " + list);
    }
}
