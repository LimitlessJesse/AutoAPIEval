import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            int length = md.getDigestLength();
            System.out.println("The length of the digest in bytes is: " + length);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
