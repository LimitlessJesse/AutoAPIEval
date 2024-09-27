import java.util.Hashtable;

public class Hashtable_4 {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");

        System.out.println(hashtable.contains("One")); // Output: true
        System.out.println(hashtable.contains("Three")); // Output: false
    }
}
