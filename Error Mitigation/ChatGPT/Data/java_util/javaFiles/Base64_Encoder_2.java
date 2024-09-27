import java.util.Base64;

public class Base64_Encoder_2 {
    public static void main(String[] args) {
        byte[] src = "Hello, World!".getBytes();
        
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encodedBytes = encoder.encode(src);
        
        System.out.println("Encoded bytes: " + new String(encodedBytes));
    }
}
