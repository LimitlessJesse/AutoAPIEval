import java.net.PasswordAuthentication;

public class PasswordAuthentication_2 {
    public static void main(String[] args) {
        char[] password = new char[]{'s', 'e', 'c', 'r', 'e', 't'};
        
        PasswordAuthentication passwordAuthentication = new PasswordAuthentication("username", password);
        
        char[] retrievedPassword = passwordAuthentication.getPassword();
        
        System.out.println("Retrieved password: " + new String(retrievedPassword));
        
        // Zero out the password information after it is no longer needed
        for (int i = 0; i < password.length; i++) {
            password[i] = 0;
        }
    }
}
