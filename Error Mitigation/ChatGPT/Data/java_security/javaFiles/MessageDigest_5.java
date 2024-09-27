import java.security.MessageDigest;

public class MessageDigest_5 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String algorithm = md.getAlgorithm();
            System.out.println("Algorithm: " + algorithm);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
