import javax.naming.Binding;

public class Binding_1 {
    public static void main(String[] args) {
        Binding binding = new Binding("name", "object");
        Object obj = binding.getObject();
        System.out.println("Object bound to the name: " + obj);
    }
}
