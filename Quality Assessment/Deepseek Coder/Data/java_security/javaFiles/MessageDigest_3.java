import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_3 {
    public static void main(String[] args) {
        String message = "Hello, World!";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(message.getBytes());
            System.out.println(new String(hash));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
