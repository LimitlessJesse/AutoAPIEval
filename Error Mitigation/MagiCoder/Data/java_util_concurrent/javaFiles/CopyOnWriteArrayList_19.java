import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Arrays;

public class CopyOnWriteArrayList_19 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("Hello", "World"));
        System.out.println(list.containsAll(Arrays.asList("Hello", "World"))); // Outputs: true
        System.out.println(list.containsAll(Arrays.asList("Hello", "World", "Java"))); // Outputs: false
    }
}
