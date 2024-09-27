import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class DigestInputStream_2 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            DigestInputStream dis = new DigestInputStream(System.in, md);
            int b;
            while ((b = dis.read())!= -1) {
                System.out.println(b);
            }
            dis.close();
            byte[] digest = md.digest();
            System.out.println(new String(digest));
        } catch (NoSuchAlgorithmException | IOException e) {
            e.printStackTrace();
        }
    }
}
