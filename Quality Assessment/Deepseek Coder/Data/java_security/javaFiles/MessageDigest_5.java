import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] message = "Hello, World!".getBytes();
            byte[] digest = md.digest(message);

            // Convert the digest to a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02X", b));
            }
            System.out.println(hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
