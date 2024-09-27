import java.io.*;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

public class DigestOutputStream_5 {
    public static void main(String[] args) {
        try {
            // Create a DigestOutputStream with a MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            DigestOutputStream dos = new DigestOutputStream(new FileOutputStream("output.txt"), md);

            // Write data to the DigestOutputStream
            byte[] data = "Hello, World!".getBytes();
            dos.write(data, 0, data.length);

            // Close the DigestOutputStream
            dos.close();

            // Get the digest value
            byte[] digest = md.digest();
            System.out.println("Digest value: " + new String(digest));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
