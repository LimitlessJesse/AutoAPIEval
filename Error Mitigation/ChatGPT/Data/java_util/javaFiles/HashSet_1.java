import java.util.HashSet;

public class HashSet_1 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        System.out.println(set.add("Hello")); // Output: true
        System.out.println(set.add("Hello")); // Output: false
        System.out.println(set); // Output: [Hello]
    }
}
