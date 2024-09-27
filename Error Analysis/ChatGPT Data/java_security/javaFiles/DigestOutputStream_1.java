import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

public class DigestOutputStream_1 {
    public static void main(String[] args) {
        // Create a MessageDigest instance
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Create a ByteArrayOutputStream to write data
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        // Create a DigestOutputStream with the specified digest and output stream
        DigestOutputStream digestOutputStream = new DigestOutputStream(baos, digest);

        // On(true) turns on the digest computation on the underlying output stream
        digestOutputStream.on(true);

        // Write data to the DigestOutputStream
        String data = "Hello World";
        digestOutputStream.write(data.getBytes());

        // Perform any additional operations

        // Close the DigestOutputStream
        digestOutputStream.close();

        // Get the digest value
        byte[] digestValue = digest.digest();
        
        // Print the digest value
        System.out.println("Digest value: " + new String(digestValue));
    }
}
