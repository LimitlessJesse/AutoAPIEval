import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialList_4 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new LinkedList<>();
        list.add("Element 1");
        list.add("Element 2");
        list.add("Element 3");
        System.out.println("Original List: " + list);

        // Remove the element at index 1
        list.remove(1);
        System.out.println("List after removal: " + list);
    }
}
