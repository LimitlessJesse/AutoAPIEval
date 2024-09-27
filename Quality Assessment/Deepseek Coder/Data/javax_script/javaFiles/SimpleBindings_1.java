import javax.script.SimpleBindings;

public class SimpleBindings_1 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("name", "John");
        System.out.println(bindings.get("name"));
    }
}
