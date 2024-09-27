import java.util.Base64;

public class Base64_Encoder_3 {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder().withoutPadding();
        String original = "Hello, World!";
        String encoded = encoder.encodeToString(original.getBytes()); 
        System.out.println("Encoded String: " + encoded);
    }
}
