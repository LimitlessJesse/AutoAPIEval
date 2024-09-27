import java.io.ByteArrayOutputStream;
import java.security.DigestOutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;

public class DigestOutputStream_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DigestOutputStream dos = new DigestOutputStream(baos, md);
            
            byte[] data = { 1, 2, 3, 4, 5 };
            dos.write(data, 0, data.length);
            dos.close();
            
            byte[] digest = md.digest();
            
            for (byte b : digest) {
                System.out.format("%02x", b);
            }
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
