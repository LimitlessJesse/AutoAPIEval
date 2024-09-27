import java.nio.ByteBuffer;
import java.util.Base64;

public class Base64_Decoder_2 {
    public static void main(String[] args) {
        ByteBuffer inputBuffer = ByteBuffer.wrap("SGVsbG8gV29ybGQh".getBytes());
        
        Base64.Decoder decoder = Base64.getDecoder();
        ByteBuffer outputBuffer = decoder.decode(inputBuffer);
        
        byte[] decodedBytes = new byte[outputBuffer.remaining()];
        outputBuffer.get(decodedBytes);
        
        System.out.println(new String(decodedBytes));
    }
}
