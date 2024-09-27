import javax.script.SimpleBindings;

public class SimpleBindings_2 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("key1", "value1");
        Object value = bindings.get("key1");
        System.out.println(value);
    }
}
