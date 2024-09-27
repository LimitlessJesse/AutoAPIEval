import java.security.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Signature_5 {
    public static void main(String[] args) {
        try {
            // Create a Signature object
            Signature signature = Signature.getInstance("SHA256withRSA");

            // Initialize the Signature object
            signature.initSign(KeyGenerator.getInstance("RSA").generateKey());

            // Update the Signature object with some data
            signature.update("Some data to sign".getBytes());

            // Generate the signature
            byte[] signedBytes = signature.sign();

            // Print the signed bytes
            for (byte b : signedBytes) {
                System.out.print(String.format("%02X", b));
            }
            System.out.println();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
