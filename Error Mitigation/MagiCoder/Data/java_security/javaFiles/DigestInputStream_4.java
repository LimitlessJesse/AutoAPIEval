import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.IOException;
import java.io.InputStream;

public class DigestInputStream_4 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            InputStream is = new DigestInputStream(System.in, md);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer))!= -1) {
                md.update(buffer, 0, len);
            }
            byte[] digest = md.digest();
            System.out.println(new String(digest));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
