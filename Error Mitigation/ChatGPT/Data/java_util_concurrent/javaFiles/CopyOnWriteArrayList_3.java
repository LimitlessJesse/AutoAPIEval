import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;

public class CopyOnWriteArrayList_3 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Hello", "World"));
        System.out.println("List before removeAll: " + list);
        
        CopyOnWriteArrayList<String> elementsToRemove = new CopyOnWriteArrayList<>(Arrays.asList("Hello"));
        boolean result = list.removeAll(elementsToRemove);
        
        System.out.println("List after removeAll: " + list);
        System.out.println("Result: " + result);
    }
}
