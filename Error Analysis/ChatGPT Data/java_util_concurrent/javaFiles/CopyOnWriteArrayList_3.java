import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;

public class CopyOnWriteArrayList_3 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();
        list.add("Hello");
        list.add("World");
        
        System.out.println("Before removeIf: " + list);
        
        // Using removeIf to remove elements starting with letter 'W'
        list.removeIf(element -> element.startsWith("W"));
        
        System.out.println("After removeIf: " + list);
    }
}
