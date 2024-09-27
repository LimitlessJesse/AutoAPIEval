import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Base64_Decoder_4 {
    public static void main(String[] args) {
        byte[] encodedBytes = Base64.getEncoder().encode("Hello, World!".getBytes());
        InputStream inputStream = new ByteArrayInputStream(encodedBytes);

        Base64.Decoder decoder = Base64.getDecoder();
        InputStream decodedStream = decoder.wrap(inputStream);

        // Now you can use the decodedStream for further processing
    }
}
