import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        System.out.println(set.isEmpty()); // prints false
        set.clear();
        System.out.println(set.isEmpty()); // prints true
    }
}
