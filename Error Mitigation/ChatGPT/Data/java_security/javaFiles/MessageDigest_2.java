import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MessageDigest_2 {
    public static void main(String[] args) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            String input = "Hello World";
            byte[] inputBytes = input.getBytes();
            byte[] hashBytes = md.digest(inputBytes);
            
            System.out.println("Hash value: " + bytesToHex(hashBytes));
        } catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found");
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
