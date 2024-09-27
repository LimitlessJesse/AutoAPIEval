import java.security.MessageDigest;

public class MessageDigest_1 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] input = "Hello World".getBytes();
            md.update(input);
            byte[] digest = md.digest();
            System.out.println("Message Digest: " + new String(digest));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
