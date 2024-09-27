import java.util.jar.Attributes;

public class Attributes_3 {
    public static void main(String[] args) {
        Attributes attributes = new Attributes();
        attributes.put("key1", "value1");
        attributes.put("key2", "value2");

        System.out.println(attributes.containsKey("key1")); // Output: true
        System.out.println(attributes.containsKey("key3")); // Output: false
    }
}
