import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();
        
        CharBuffer charBuffer = CharBuffer.wrap("Hello, World!");
        
        try {
            ByteBuffer byteBuffer = encoder.encode(charBuffer);
            byte[] byteArray = byteBuffer.array();
            
            System.out.println("Encoded bytes: ");
            for (byte b : byteArray) {
                System.out.print(b + " ");
            }
        } catch (CharacterCodingException e) {
            e.printStackTrace();
        }
    }
}
