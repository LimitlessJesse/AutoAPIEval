import java.util.Base64;

public class Base64_1 {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        String original = "Hello, World!";
        String encoded = encoder.encodeToString(original.getBytes());
        System.out.println("Encoded: " + encoded);
    }
}
