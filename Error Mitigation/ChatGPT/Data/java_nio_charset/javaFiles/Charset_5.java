import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class Charset_5 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetDecoder decoder = charset.newDecoder();
        System.out.println("New decoder created: " + decoder);
    }
}
