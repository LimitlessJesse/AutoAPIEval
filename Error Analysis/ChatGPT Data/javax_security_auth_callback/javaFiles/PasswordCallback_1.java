import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_1 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter your password: ", false);
        char[] password = passwordCallback.getPassword();
        System.out.println("Password entered: " + String.valueOf(password));
    }
}
