import java.io.ByteArrayOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class DigestOutputStream_3 {
    public static void main(String[] args) {
        try {
            // Create MessageDigest instance
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            
            // Create DigestOutputStream with ByteArrayOutputStream
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DigestOutputStream digestOutputStream = new DigestOutputStream(byteArrayOutputStream, digest);
            
            // Write data to DigestOutputStream
            digestOutputStream.write("Hello, World!".getBytes());
            digestOutputStream.close(); // Need to close to calculate the digest
            
            // Get the calculated digest
            byte[] hash = digest.digest();
            String hashString = Arrays.toString(hash);
            
            // Print the calculated hash value
            System.out.println("Hash: " + hashString);
        } catch (NoSuchAlgorithmException e) {
            System.err.println("Error creating MessageDigest: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
