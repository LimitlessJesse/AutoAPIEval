import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_1 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("prompt", false);
        char[] password = passwordCallback.getPassword();
        System.out.println("Retrieved password: " + new String(password));
    }
}
