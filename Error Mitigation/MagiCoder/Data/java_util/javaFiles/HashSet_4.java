import java.util.HashSet;

public class HashSet_4 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.isEmpty()); // Output: true

        set.add("Hello");
        System.out.println(set.isEmpty()); // Output: false
    }
}
