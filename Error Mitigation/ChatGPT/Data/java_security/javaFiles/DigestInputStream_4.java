import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;

public class DigestInputStream_4 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            InputStream is = new FileInputStream("example.txt");
            DigestInputStream dis = new DigestInputStream(is, md);
            
            MessageDigest messageDigest = dis.getMessageDigest();
            
            System.out.println("Message Digest Algorithm: " + messageDigest.getAlgorithm());
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
