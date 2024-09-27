import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_4 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter password: ", false);
        String prompt = passwordCallback.getPrompt();
        System.out.println(prompt);
    }
}
