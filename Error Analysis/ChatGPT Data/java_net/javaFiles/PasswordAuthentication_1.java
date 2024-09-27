import java.net.PasswordAuthentication;

public class PasswordAuthentication_1 {
    public static void main(String[] args) {
        // Create a PasswordAuthentication object
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication("username", "password".toCharArray());

        // Get the password as a char array
        char[] password = passwordAuthentication.getPassword();

        // Printing the password as a String (for demonstration purposes)
        System.out.println("Password: " + new String(password));
    }
}
