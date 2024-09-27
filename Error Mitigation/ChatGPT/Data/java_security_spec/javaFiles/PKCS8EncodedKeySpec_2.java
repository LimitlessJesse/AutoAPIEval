import java.security.spec.PKCS8EncodedKeySpec;

public class PKCS8EncodedKeySpec_2 {
    public static void main(String[] args) {
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(new byte[]{});
        String format = keySpec.getFormat();
        System.out.println("Format: " + format);
    }
}
