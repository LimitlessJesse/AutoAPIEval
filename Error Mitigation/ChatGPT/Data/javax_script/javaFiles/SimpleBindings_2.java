import javax.script.SimpleBindings;

public class SimpleBindings_2 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("key1", "value1");
        bindings.put("key2", "value2");

        Object value1 = bindings.get("key1");
        Object value3 = bindings.get("key3");

        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key3: " + value3);
    }
}
