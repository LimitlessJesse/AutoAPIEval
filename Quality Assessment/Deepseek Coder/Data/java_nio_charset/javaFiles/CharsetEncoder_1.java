import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_1 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();

        String str = "Hello, World!";
        boolean canEncode = encoder.canEncode(str);

        System.out.println("Can encode \"" + str + "\": " + canEncode);
    }
}
