import javax.script.SimpleBindings;

public class SimpleBindings_4 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("key1", "value1");
        System.out.println(bindings.containsKey("key1")); // Output: true
        System.out.println(bindings.containsKey("key2")); // Output: false
    }
}
