import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_1 {
    public static void main(String[] args) {
        // Key example
        byte[] keyBytes = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "AES");
        
        byte[] encodedKey = secretKey.getEncoded();
        System.out.println("Encoded key: " + encodeToString(encodedKey));
    }
    
    // Utility method to convert byte array to string for display
    private static String encodeToString(byte[] array) {
        StringBuilder sb = new StringBuilder();
        for (byte b : array) {
            sb.append(String.format("%02X ", b));
        }
        return sb.toString();
    }
}
