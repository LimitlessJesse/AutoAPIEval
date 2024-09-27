import java.security.MessageDigestSpi;
import java.security.NoSuchAlgorithmException;

public class MessageDigestSpi_2 {
    public static void main(String[] args) {
        byte[] input = "Hello, World".getBytes();
        try {
            MessageDigestSpi digest = MessageDigestSpi.getInstance("MD5");
            digest.engineUpdate(input);
            byte[] result = digest.engineDigest();
            System.out.println(new String(result));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
