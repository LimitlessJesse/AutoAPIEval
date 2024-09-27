import javax.naming.*;

public class Binding_1 {
    public static void main(String[] args) throws NamingException {
        Context context = new InitialContext();
        Binding binding = (Binding) context.lookup("java.naming.factory.initial=org.apache.naming.java.javaURLContextFactory");
        binding.setObject("Hello");
        System.out.println(binding.getObject());
    }
}
