import javax.security.auth.callback.NameCallback;

public class NameCallback_2 {
    public static void main(String[] args) {
        NameCallback callback = new NameCallback("Please enter your name: ");
        callback.setName("John Doe");
        System.out.println("Retrieved name: " + callback.getName());
    }
}
