import java.io.*;
import java.security.DigestOutputStream;
import java.security.MessageDigest;

public class DigestOutputStream_4 {
    public static void main(String[] args) {
        try {
            // Create a DigestOutputStream with a MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            OutputStream output = new FileOutputStream("output.txt");
            DigestOutputStream digestOutput = new DigestOutputStream(output, md);

            // Write a byte to the DigestOutputStream
            int b = 65; // ASCII value of 'A'
            digestOutput.write(b);

            // Close the streams
            digestOutput.close();
            output.close();

            // Get the digest value
            byte[] digest = md.digest();
            System.out.println("Digest value: " + new String(digest));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
