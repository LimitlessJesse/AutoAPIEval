import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_2 {
    public static void main(String[] args) {
        byte[] key = {0x00, 0x01, 0x02, 0x03, 0x04, 0x05, 0x06, 0x07, 0x08, 0x09, 0x0A, 0x0B, 0x0C, 0x0D, 0x0E, 0x0F};
        String algorithm = "AES";
        
        SecretKeySpec secretKey = new SecretKeySpec(key, algorithm);
        String keyAlgorithm = secretKey.getAlgorithm();
        
        System.out.println("Key Algorithm: " + keyAlgorithm);
    }
}
