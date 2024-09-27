import java.io.ByteArrayInputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestInputStream_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            ByteArrayInputStream bais = new ByteArrayInputStream("Hello World".getBytes());
            DigestInputStream dis = new DigestInputStream(bais, md);

            // Turn digest function on
            dis.on(true);

            // Read from the stream to update the message digest
            byte[] buffer = new byte[1024];
            while (dis.read(buffer) != -1) {
                // Reading from the stream
            }

            // Turn digest function off
            dis.on(false);

            // Digest value after reading
            byte[] digest = md.digest();
            System.out.println("Digest value: " + new String(digest));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
