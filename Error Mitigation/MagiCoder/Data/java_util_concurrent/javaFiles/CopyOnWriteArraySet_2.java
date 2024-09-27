import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_2 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        set.add("World");

        set.addAll(Arrays.asList("Java", "Programming"));

        System.out.println(set);
    }
}
