import java.net.Authenticator;
import java.net.InetAddress;
import java.net.PasswordAuthentication;

public class Authenticator_2 {
    public static void main(String[] args) {
        InetAddress addr = null;
        int port = 8080;
        String protocol = "http";
        String prompt = "Please enter your credentials";
        String scheme = "Basic";

        PasswordAuthentication passwordAuthentication = Authenticator.requestPasswordAuthentication(addr, port, protocol, prompt, scheme);

        if (passwordAuthentication != null) {
            String username = passwordAuthentication.getUserName();
            char[] password = passwordAuthentication.getPassword();
            System.out.println("Username: " + username);
            System.out.println("Password: " + new String(password));
        } else {
            System.out.println("Username/password could not be obtained.");
        }
    }
}
