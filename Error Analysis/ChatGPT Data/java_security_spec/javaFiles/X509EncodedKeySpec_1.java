import java.security.spec.X509EncodedKeySpec;

public class X509EncodedKeySpec_1 {
    public static void main(String[] args) {
        try {
            byte[] encoded = new byte[] { 0x32, 0x45, 0x67, 0x12 };
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(encoded);
            byte[] encodedKey = x509EncodedKeySpec.getEncoded();
            System.out.println("Encoded key: " + java.util.Arrays.toString(encodedKey));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
