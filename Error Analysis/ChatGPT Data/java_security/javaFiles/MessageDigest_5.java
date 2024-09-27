import java.security.MessageDigest;

public class MessageDigest_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            System.out.println("Algorithm used: " + md.getAlgorithm());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
