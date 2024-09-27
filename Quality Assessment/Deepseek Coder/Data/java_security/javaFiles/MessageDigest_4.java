import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_4 {
    public static void main(String[] args) {
        try {
            // Create a MessageDigest instance for MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

            // Reset the digest
            md.reset();

            // Process the data
            byte[] data = "Hello, World!".getBytes();
            md.update(data);

            // Get the digest
            byte[] digest = md.digest();

            // Print the digest
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
            System.out.println();

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
