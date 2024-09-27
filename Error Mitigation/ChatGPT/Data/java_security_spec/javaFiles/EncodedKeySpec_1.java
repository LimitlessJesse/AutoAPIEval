import java.security.spec.EncodedKeySpec;

public class EncodedKeySpec_1 {
    public static void main(String[] args) {
        EncodedKeySpec keySpec = new EncodedKeySpec(new byte[]{1, 2, 3, 4, 5});
        byte[] encodedKey = keySpec.getEncoded();
        System.out.println("Encoded Key: " + new String(encodedKey));
    }
}
