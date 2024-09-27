import java.security.spec.X509EncodedKeySpec;

public class X509EncodedKeySpec_1 {
    public static void main(String[] args) {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(new byte[]{0x01, 0x02, 0x03});
        byte[] encodedKey = keySpec.getEncoded();
        System.out.println("Encoded key: " + encodedKey);
    }
}
