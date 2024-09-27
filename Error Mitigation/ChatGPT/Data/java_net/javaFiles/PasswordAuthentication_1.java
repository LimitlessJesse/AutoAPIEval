import java.net.PasswordAuthentication;

public class PasswordAuthentication_1 {
    public static void main(String[] args) {
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication("username", "password".toCharArray());
        String username = passwordAuthentication.getUserName();
        System.out.println("Username: " + username);
    }
}
