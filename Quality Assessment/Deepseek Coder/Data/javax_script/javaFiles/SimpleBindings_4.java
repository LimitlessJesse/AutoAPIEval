import javax.script.SimpleBindings;

public class SimpleBindings_4 {
    public static void main(String[] args) {
        SimpleBindings bindings = new SimpleBindings();
        bindings.put("name", "John");
        bindings.put("age", 30);

        boolean hasName = bindings.containsKey("name");
        boolean hasAge = bindings.containsKey("age");
        boolean hasAddress = bindings.containsKey("address");

        System.out.println("Has name: " + hasName);
        System.out.println("Has age: " + hasAge);
        System.out.println("Has address: " + hasAddress);
    }
}
