import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_2 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("prompt", false);
        passwordCallback.clearPassword();
    }
}
