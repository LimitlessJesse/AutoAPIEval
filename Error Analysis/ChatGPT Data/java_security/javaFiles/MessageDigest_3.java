import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_3 {
    public static void main(String[] args) {
        byte[] input = "Hello".getBytes();
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] digest = md.digest(input);
            for (int i = 0; i < digest.length; i++) {
                System.out.printf("%02x", digest[i]);
            }
        } catch (NoSuchAlgorithmException e) {
            System.out.println("No such algorithm");
        }
    }
}
