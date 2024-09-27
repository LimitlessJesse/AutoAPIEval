import javax.naming.Binding;

public class Binding_4 {
    public static void main(String[] args) {
        Binding binding = new Binding("name", "class", new Object());
        System.out.println(binding.toString());
    }
}
