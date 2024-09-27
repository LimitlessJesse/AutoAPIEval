import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_12 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        set.add("World");

        Object[] array = set.toArray();

        for (Object obj : array) {
            System.out.println(obj);
        }
    }
}
