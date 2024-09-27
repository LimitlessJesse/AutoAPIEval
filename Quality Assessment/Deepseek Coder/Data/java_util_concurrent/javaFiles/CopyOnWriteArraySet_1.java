import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_1 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        boolean isAdded = set.add("Hello");
        System.out.println("Element added successfully: " + isAdded);
        System.out.println("Set: " + set);
    }
}
