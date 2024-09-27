import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;

public class PasswordCallback_2 {
    public static void main(String[] args) {
        PasswordCallback passwordCallback = new PasswordCallback("Enter password", false);
        System.out.println("Please enter your password:");
        System.out.flush();

        try {
            char[] password = passwordCallback.getPassword();
            System.out.println("You entered: " + new String(password));
        } catch (UnsupportedCallbackException e) {
            System.out.println("UnsupportedCallbackException: " + e.getMessage());
        }
    }
}
