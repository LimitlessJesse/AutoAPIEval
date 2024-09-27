import javax.crypto.spec.SecretKeySpec;

public class SecretKeySpec_3 {
    public static void main(String[] args) {
        byte[] key = {1, 2, 3, 4, 5};
        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        String format = secretKey.getFormat();
        System.out.println("Format: " + format);
    }
}
