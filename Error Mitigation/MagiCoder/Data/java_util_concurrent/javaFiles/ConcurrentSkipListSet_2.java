import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_2 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Hello");
        set.add("World");
        System.out.println("Before clear: " + set);
        set.clear();
        System.out.println("After clear: " + set);
    }
}
