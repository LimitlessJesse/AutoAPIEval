import javax.script.SimpleBindings;

public class SimpleBindings_4 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("key1", "value1");
        bindings.put("key2", "value2");

        System.out.println("Before removal: " + bindings);

        Object removedValue = bindings.remove("key1");

        System.out.println("Removed value: " + removedValue);
        System.out.println("After removal: " + bindings);
    }
}
