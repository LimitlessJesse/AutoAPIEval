import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_1 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            System.out.println(md);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
