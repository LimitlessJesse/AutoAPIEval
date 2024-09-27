import java.security.spec.PKCS8EncodedKeySpec;

public class PKCS8EncodedKeySpec_1 {
    public static void main(String[] args) {
        byte[] encoded = new byte[] {1, 2, 3, 4, 5};
        PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(encoded);
        byte[] encodedBytes = spec.getEncoded();

        System.out.println("Encoded byte array: " + encodedBytes);
    }
}
