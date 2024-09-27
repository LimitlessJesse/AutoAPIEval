import javax.script.SimpleBindings;

public class SimpleBindings_5 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("name", "John Doe");
        
        int size = bindings.size();
        System.out.println("Size of SimpleBindings: " + size);
    }
}
