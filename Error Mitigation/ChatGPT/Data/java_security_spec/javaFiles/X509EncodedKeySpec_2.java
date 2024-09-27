import java.security.spec.X509EncodedKeySpec;

public class X509EncodedKeySpec_2 {
    public static void main(String[] args) {
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(new byte[]{});
        String format = keySpec.getFormat();
        System.out.println("Encoding format: " + format);
    }
}
