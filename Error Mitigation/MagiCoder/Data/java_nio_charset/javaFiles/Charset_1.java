import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;

public class Charset_1 {
    public static void main(String[] args) {
        try {
            Charset charset = Charset.forName("UTF-8");
            System.out.println(charset.name());
        } catch (IllegalCharsetNameException | UnsupportedCharsetException e) {
            e.printStackTrace();
        }
    }
}
