import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Charset_3 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        System.out.println(decoder);
    }
}
