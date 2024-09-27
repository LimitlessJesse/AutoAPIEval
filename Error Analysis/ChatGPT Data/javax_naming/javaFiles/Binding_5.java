import javax.naming.Binding;

public class Binding_5 {
    public static void main(String[] args) {
        Binding binding = new Binding("key", "value");
        System.out.println(binding.toString());
    }
}
