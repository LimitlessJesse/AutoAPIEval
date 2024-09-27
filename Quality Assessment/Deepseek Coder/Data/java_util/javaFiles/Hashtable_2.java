import java.util.Hashtable;

public class Hashtable_2 {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("key1", "value1");
        hashtable.put("key2", "value2");
        hashtable.put("key3", "value3");

        String value = hashtable.get("key2");
        System.out.println(value);  // Output: value2
    }
}
