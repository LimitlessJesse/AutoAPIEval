import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_4 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashInBytes = md.digest("Hello World".getBytes());

            // Print the hash
            for (byte b : hashInBytes) {
                System.out.format("%02x", b);
            }

            // Reset the digest
            md.reset();

            // Now you can use the digest again
            hashInBytes = md.digest("Hello World".getBytes());

            // Print the hash
            for (byte b : hashInBytes) {
                System.out.format("%02x", b);
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
