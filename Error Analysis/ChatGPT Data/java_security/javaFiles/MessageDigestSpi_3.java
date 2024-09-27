import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;

public class MessageDigestSpi_3 {
    public static void main(String[] args) {
        byte[] input = "Hello, World!".getBytes();
        try {
            MessageDigestSpi messageDigest = MessageDigestSpi.getInstance("SHA-256");
            messageDigest.engineUpdate(input, 0, input.length);
            byte[] digest = messageDigest.digest();
            System.out.println("Digest: " + new String(digest));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found.");
        }
    }
}
