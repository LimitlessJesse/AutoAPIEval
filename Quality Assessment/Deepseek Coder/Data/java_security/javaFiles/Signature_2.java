import java.security.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Signature_2 {
    public static void main(String[] args) {
        try {
            // Create a Signature object
            Signature signature = Signature.getInstance("SHA256withRSA");

            // Create a MessageDigest object
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");

            // Create a byte array
            byte[] input = "Hello, World!".getBytes();

            // Update the Signature object with the input
            signature.update(input);

            // Update the MessageDigest object with the input
            messageDigest.update(input);

            // Print the hash of the input
            System.out.println("Hash of input: " + new String(messageDigest.digest()));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
