import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_4 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter your password", false);
        System.out.println(passwordCallback.getPrompt());
    }
}
