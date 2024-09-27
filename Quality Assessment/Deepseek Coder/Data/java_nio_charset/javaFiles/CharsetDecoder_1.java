import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;

public class CharsetDecoder_1 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();

        byte[] inputBytes = input.getBytes();
        ByteBuffer byteBuffer = ByteBuffer.wrap(inputBytes);

        CharBuffer charBuffer = CharBuffer.allocate(inputBytes.length);

        CoderResult coderResult = decoder.decode(byteBuffer, charBuffer, true);

        if (coderResult.isUnderflow()) {
            charBuffer.flip();
            System.out.println(charBuffer.toString());
        } else {
            System.out.println("Decoding error: " + coderResult.toString());
        }
    }
}
