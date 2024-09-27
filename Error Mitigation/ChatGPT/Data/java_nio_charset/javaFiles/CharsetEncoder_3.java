import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_3 {
    public static void main(String[] args) {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        Charset charset = encoder.charset();
        System.out.println("Charset: " + charset);
    }
}
