import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_1 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        System.out.println(set.add("Hello")); // Output: true
        System.out.println(set.add("Hello")); // Output: false
    }
}
