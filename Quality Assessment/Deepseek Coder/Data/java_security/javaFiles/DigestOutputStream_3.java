import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.DigestOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DigestOutputStream_3 {
    public static void main(String[] args) {
        try {
            // Create a new MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Create a new DigestOutputStream with the MessageDigest
            DigestOutputStream dos = new DigestOutputStream(new ByteArrayOutputStream(), md);

            // Create a byte array to write
            byte[] data = "Hello, World!".getBytes();

            // Write the byte array to the DigestOutputStream
            dos.write(data, 0, data.length);

            // Get the digest
            byte[] digest = md.digest();

            // Print the digest
            System.out.println(new String(digest));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
