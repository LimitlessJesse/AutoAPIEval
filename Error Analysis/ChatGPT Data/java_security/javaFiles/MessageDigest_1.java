import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class MessageDigest_1 {
    public static void main(String[] args) {
        try {
            byte[] input = "Hello World".getBytes();
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input);
            byte[] digest = md.digest();
            System.out.println("MD5 Hash: " + Arrays.toString(digest));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
