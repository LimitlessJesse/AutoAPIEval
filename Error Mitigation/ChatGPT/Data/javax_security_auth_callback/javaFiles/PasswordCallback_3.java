import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_3 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter password: ", false);
        char[] password = "myPassword".toCharArray();
        passwordCallback.setPassword(password);
    }
}
