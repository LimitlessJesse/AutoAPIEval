import java.security.DigestOutputStream;
import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;

public class DigestOutputStream_1 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DigestOutputStream dos = new DigestOutputStream(baos, md);

            // Turn on the digest function
            dos.on(true);

            // Write data to the stream
            dos.write("Hello, World!".getBytes());

            // Turn off the digest function
            dos.on(false);

            // Write more data to the stream
            dos.write("This is a test.".getBytes());

            // Get the digest value
            byte[] digest = md.digest();
            System.out.println("Digest value: " + new String(digest));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
