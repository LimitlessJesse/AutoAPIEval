import javax.security.auth.callback.PasswordCallback;

public class PasswordCallback_2 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter your password: ", false);
        char[] password = "myPassword".toCharArray();
        passwordCallback.setPassword(password);
        System.out.println("Password set successfully.");
    }
}
