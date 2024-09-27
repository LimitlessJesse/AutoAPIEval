import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class PasswordAuthentication_2 {
    public static void main(String[] args) {
        Authenticator.setDefault(new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("username", "password".toCharArray());
            }
        });

        PasswordAuthentication pa = Authenticator.requestPasswordAuthentication("My Application", null, 8000, "localhost", "HTTP", Authenticator.RequestorType.PROXY, null, null);
        String username = pa.getUserName();
        System.out.println("Username: " + username);
    }
}
