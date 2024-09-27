import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Authenticator_3 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password".toCharArray());
            }
        });

        // Now you can use any network related code that needs authentication
    }
}
