import java.util.AbstractSequentialList;
import java.util.LinkedList;

public class AbstractSequentialList_1 {
    public static void main(String[] args) {
        AbstractSequentialList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        System.out.println(list.get(0));  // Output: Hello
        System.out.println(list.get(1));  // Output: World
    }
}
