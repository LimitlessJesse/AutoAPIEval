import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class Authenticator_2 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password".toCharArray());
            }
        });
    }
}
