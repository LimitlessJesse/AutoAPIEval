import java.security.DigestOutputStream;
import java.security.MessageDigest;

public class DigestOutputStream_2 {
    public static void main(String[] args) {
        // Create a MessageDigest instance
        MessageDigest digest = MessageDigest.getInstance("SHA-256");

        // Create a DigestOutputStream instance and set the MessageDigest
        DigestOutputStream digestOutputStream = new DigestOutputStream(System.out, digest);

        // Use the setMessageDigest method to set the MessageDigest
        digestOutputStream.setMessageDigest(digest);

        // Perform operations with the DigestOutputStream
        
    }
}
