import java.security.DigestOutputStream;
import java.security.MessageDigest;

public class DigestOutputStream_3 {
    public static void main(String[] args) {
        DigestOutputStream digestOutputStream = new DigestOutputStream(System.out, MessageDigest.getInstance("SHA-256"));
        MessageDigest messageDigest = digestOutputStream.getMessageDigest();
        System.out.println("Message Digest Algorithm: " + messageDigest.getAlgorithm());
    }
}
