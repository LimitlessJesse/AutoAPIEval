import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_2 {
    public static void main(String[] args) {
        try {
            // Create a MessageDigest instance for SHA-256
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Update the digest with some data
            String data = "Hello, World!";
            md.update(data.getBytes());

            // Get the digest as a byte array
            byte[] digest = md.digest();

            // Print the digest as a hexadecimal string
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
