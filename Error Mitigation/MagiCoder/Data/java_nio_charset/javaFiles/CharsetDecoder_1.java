import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class CharsetDecoder_1 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        decoder.reset();
    }
}
