import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialList_1 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");

        // Retrieve the element at index 1
        String element = list.get(1);
        System.out.println(element);  // Output: World
    }
}
