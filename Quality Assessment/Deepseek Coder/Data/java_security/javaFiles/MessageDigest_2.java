import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_2 {
    public static void main(String[] args) {
        String data = "Hello, World!";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(data.getBytes());

            byte[] digest = md.digest();

            StringBuilder hexString = new StringBuilder();
            for (byte b : digest) {
                hexString.append(String.format("%02X", 0xFF & b));
            }
            String hash = hexString.toString();

            System.out.println("Hash: " + hash);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
