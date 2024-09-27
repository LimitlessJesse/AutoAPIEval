import java.nio.charset.Charset;

public class Charset_2 {
    public static void main(String[] args) {
        Charset charset = Charset.defaultCharset();
        System.out.println("Default Charset: " + charset.displayName());
    }
}
