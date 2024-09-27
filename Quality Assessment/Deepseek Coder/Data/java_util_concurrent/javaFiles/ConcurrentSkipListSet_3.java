import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_3 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Hello");
        System.out.println(set.contains("Hello"));  // Output: true
        System.out.println(set.contains("World"));  // Output: false
    }
}
