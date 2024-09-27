import java.security.DigestOutputStream;
import java.security.MessageDigest;

public class DigestOutputStream_2 {
    public static void main(String[] args) {
        DigestOutputStream digestOutputStream = new DigestOutputStream(System.out, MessageDigest.getInstance("SHA-256"));
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        digestOutputStream.setMessageDigest(digest);
    }
}
