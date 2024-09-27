import java.io.ByteArrayInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestInputStream_3 {
    public static void main(String[] args) {
        try {
            // Create a new MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Create a new ByteArrayInputStream instance
            ByteArrayInputStream bis = new ByteArrayInputStream("Hello, World!".getBytes());

            // Create a new DigestInputStream instance
            DigestInputStream dis = new DigestInputStream(bis, md);

            // Read from the input stream
            int b;
            while ((b = dis.read())!= -1) {
                // Do nothing, just read the data
            }

            // Get the digest
            byte[] digest = md.digest();

            // Print the digest
            for (byte b1 : digest) {
                System.out.printf("%02x", b1);
            }
            System.out.println();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
