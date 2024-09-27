import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_1 {
    public static void main(String[] args) {
        byte[] keyBytes = {0x00, 0x01, 0x02, 0x03, 0x04};
        SecretKeySpec secretKey = new SecretKeySpec(keyBytes, "AES");
        
        byte[] encodedKey = secretKey.getEncoded();
        
        System.out.println("Encoded key:");
        for (byte b : encodedKey) {
            System.out.print(b + " ");
        }
    }
}
