import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_3 {
    public static void main(String[] args) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Update the digest with some data
            md.update("Hello, World!".getBytes());

            // Complete the hash computation and get the digest
            byte[] digest = md.digest();

            // Print the digest as a hexadecimal string
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
