import java.util.Base64;
import java.nio.ByteBuffer;

public class Base64_Decoder_5 {
    public static void main(String[] args) {
        String encodedString = "SGVsbG8gd29ybGQ="; // "Hello world" base64 encoded
        Base64.Decoder decoder = Base64.getDecoder();
        ByteBuffer byteBuffer = ByteBuffer.wrap(encodedString.getBytes());
        byte[] decodedBytes = decoder.decode(byteBuffer).array();
        String decodedString = new String(decodedBytes);
        System.out.println(decodedString);
    }
}
