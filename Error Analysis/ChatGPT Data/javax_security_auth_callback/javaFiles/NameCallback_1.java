import javax.security.auth.callback.NameCallback;

public class NameCallback_1 {
    public static void main(String[] args) {
        NameCallback callback = new NameCallback("Please enter your name: ");
        String name = callback.getName();
        System.out.println("Hello, " + name);
    }
}
