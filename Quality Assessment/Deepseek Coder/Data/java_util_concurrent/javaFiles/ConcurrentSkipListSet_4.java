import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSet_4 {
    public static void main(String[] args) {
        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();
        System.out.println(set.isEmpty()); // prints: true
        
        set.add("Hello");
        System.out.println(set.isEmpty()); // prints: false
    }
}
