import javax.naming.Binding;

public class Binding_1 {
    public static void main(String[] args) {
        Binding binding = new Binding("key", "value", null, true);
        
        Object obj = binding.getObject();
        
        System.out.println(obj.toString());
    }
}
