import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_2 {
    public static void main(String[] args) {
        String data = "Hello World";
        
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] digest = md.digest(data.getBytes());
            
            System.out.println("Hashed value: " + bytesToHex(digest));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    private static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
