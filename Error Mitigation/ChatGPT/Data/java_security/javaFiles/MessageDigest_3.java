import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_3 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] data = "Hello World".getBytes();
            byte[] digest = new byte[32]; // SHA-256 produces a 32-byte digest

            int bytesPlaced = md.digest(data, 0, data.length, digest, 0, digest.length);
            System.out.println("Number of bytes placed into digest: " + bytesPlaced);
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        }
    }
}
