import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_4 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        System.out.println(set);

        set.clear();
        System.out.println("Set after clear: " + set);
    }
}
