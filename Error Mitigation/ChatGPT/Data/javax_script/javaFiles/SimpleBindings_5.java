import javax.script.SimpleBindings;

public class SimpleBindings_5 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("key1", "value1");
        bindings.put("key2", "value2");

        System.out.println(bindings.containsKey("key1")); // Output: true
        System.out.println(bindings.containsKey("key3")); // Output: false
    }
}
