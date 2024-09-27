import java.security.spec.EncodedKeySpec;

public class EncodedKeySpec_2 {
    public static void main(String[] args) {
        EncodedKeySpec keySpec = new EncodedKeySpec(new byte[]{});
        String format = keySpec.getFormat();
        System.out.println("Encoding format: " + format);
    }
}
