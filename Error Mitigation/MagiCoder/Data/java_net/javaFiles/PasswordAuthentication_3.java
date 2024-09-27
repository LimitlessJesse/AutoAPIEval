import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class PasswordAuthentication_3 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password".toCharArray());
            }
        });

        PasswordAuthentication pa = Authenticator.requestPasswordAuthentication("host", 80, "prompt", "message", "scheme", "url", null, 0);
        char[] password = pa.getPassword();

        // Don't forget to zero out the password information after it is no longer needed.
        for (int i = 0; i < password.length; i++) {
            password[i] = 0;
        }
    }
}
