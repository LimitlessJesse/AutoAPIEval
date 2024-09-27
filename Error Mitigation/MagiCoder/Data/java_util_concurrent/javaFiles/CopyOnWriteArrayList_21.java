import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayList_21 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Hello", "World", "Java"));
        List<String> otherList = Arrays.asList("Hello", "Java");
        System.out.println("Original list: " + list);
        System.out.println("Other list: " + otherList);
        boolean result = list.retainAll(otherList);
        System.out.println("List after retainAll: " + list);
        System.out.println("Result: " + result);
    }
}
