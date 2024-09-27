import java.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.IOException;

public class Base64_Decoder_3 {
    public static void main(String[] args) {
        byte[] encodedBytes = Base64.getEncoder().encode("Hello, World!".getBytes());
        InputStream inputStream = new ByteArrayInputStream(encodedBytes);
        
        Base64.Decoder decoder = Base64.getDecoder();
        InputStream decodedStream = decoder.wrap(inputStream);
        
        try {
            int data;
            while ((data = decodedStream.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
