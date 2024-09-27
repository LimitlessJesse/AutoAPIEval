import java.net.PasswordAuthentication;

public class PasswordAuthentication_2 {
    public static void main(String[] args) {
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication("username", "password".toCharArray());
        String username = new String(passwordAuthentication.getUserName());
        System.out.println("Username: " + username);
    }
}
