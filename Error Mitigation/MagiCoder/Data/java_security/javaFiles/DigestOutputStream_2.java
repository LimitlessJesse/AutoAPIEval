import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.DigestOutputStream;
import java.io.IOException;

public class DigestOutputStream_2 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            DigestOutputStream dos = new DigestOutputStream(System.out, md);
            dos.write(65); // 'A'
            byte[] digest = dos.getMessageDigest().digest();
            for (byte b : digest) {
                System.out.printf("%02x", b);
            }
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
