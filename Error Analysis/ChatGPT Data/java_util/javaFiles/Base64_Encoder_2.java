import java.util.Base64;
import java.util.Arrays;

public class Base64_Encoder_2 {
    public static void main(String[] args) {
        byte[] src = {1, 2, 3, 4, 5};
        Base64.Encoder encoder = Base64.getEncoder();
        String encodedString = encoder.encodeToString(src);
        System.out.println("Encoded String: " + encodedString);
    }
}
