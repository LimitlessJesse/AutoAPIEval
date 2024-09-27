import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class Charset_3 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Charset charset = Charset.forName("UTF-8");
        ByteBuffer byteBuffer = ByteBuffer.wrap(input.getBytes());
        CharsetDecoder decoder = charset.newDecoder();
        decoder.onMalformedInput(CodingErrorAction.REPLACE);
        decoder.onUnmappableCharacter(CodingErrorAction.REPLACE);
        CharBuffer charBuffer = decoder.decode(byteBuffer);
        System.out.println(charBuffer.toString());
    }
}
