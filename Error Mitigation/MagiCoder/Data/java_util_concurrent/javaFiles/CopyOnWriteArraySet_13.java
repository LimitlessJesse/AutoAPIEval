import java.util.concurrent.CopyOnWriteArraySet;

public class CopyOnWriteArraySet_13 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<>();
        set.add("Hello");
        set.add("World");

        String[] array = set.toArray(new String[0]);

        for (String s : array) {
            System.out.println(s);
        }
    }
}
