import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class Charset_2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();

        System.out.println(encoder);
    }
}
