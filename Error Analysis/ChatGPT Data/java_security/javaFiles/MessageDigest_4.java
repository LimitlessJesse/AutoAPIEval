import java.security.MessageDigest;

public class MessageDigest_4 {
    public static void main(String[] args) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        messageDigest.update("Hello, World!".getBytes());

        // Resetting the MessageDigest
        messageDigest.reset();
        System.out.println("MessageDigest reset");
    }
}
