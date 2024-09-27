import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_5 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        set.add("Hello");
        boolean isRemoved = set.remove("Hello");
        System.out.println(isRemoved);  // Output: true
        System.out.println(set);  // Output: []
    }
}
