import java.util.Base64;

public class Base64_Encoder_2 {
    public static void main(String[] args) {
        byte[] src = {1, 2, 3, 4, 5};
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encoded = encoder.encode(src);
        System.out.println(new String(encoded));
    }
}
