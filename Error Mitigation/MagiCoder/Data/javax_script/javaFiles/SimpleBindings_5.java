import javax.script.SimpleBindings;

public class SimpleBindings_5 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("name", "John");
        bindings.put("age", 30);

        System.out.println("Bindings before clear: " + bindings);

        bindings.clear();

        System.out.println("Bindings after clear: " + bindings);
    }
}
