import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.DigestInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class DigestInputStream_1 {
    public static void main(String[] args) {
        try {
            // Create a new MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Create a new ByteArrayInputStream instance
            ByteArrayInputStream bis = new ByteArrayInputStream("Hello, World!".getBytes());

            // Create a new DigestInputStream instance
            DigestInputStream dis = new DigestInputStream(bis, md);

            // Create a buffer to hold the data
            byte[] buffer = new byte[1024];

            // Read the data from the DigestInputStream
            int read = dis.read(buffer, 0, buffer.length);

            // Print the number of bytes read
            System.out.println("Number of bytes read: " + read);

            // Print the digest
            byte[] digest = md.digest();
            System.out.println("Digest: " + new String(digest));

        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
