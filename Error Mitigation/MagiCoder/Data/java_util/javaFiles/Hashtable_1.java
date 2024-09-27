import java.util.Hashtable;

public class Hashtable_1 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        hashtable.put("key3", "value3");

        System.out.println(hashtable.contains("value1")); // Output: true
        System.out.println(hashtable.contains("value4")); // Output: false
    }
}
