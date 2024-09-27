import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.DigestOutputStream;
import java.io.IOException;

public class DigestOutputStream_1 {
    public static void main(String[] args) {
        try {
            // Create a new MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Create a new DigestOutputStream with the MessageDigest
            DigestOutputStream dos = new DigestOutputStream(System.out, md);

            // Write a byte to the DigestOutputStream
            dos.write(65); // 'A'

            // Print the digest
            byte[] digest = md.digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
            System.out.println();

        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
