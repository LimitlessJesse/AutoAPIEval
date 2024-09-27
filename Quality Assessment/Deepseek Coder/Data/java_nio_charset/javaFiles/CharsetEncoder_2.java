import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_2 {
    public static void main(String[] args) {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        byte[] bytes = "Hello".getBytes();
        boolean isLegal = encoder.isLegalReplacement(bytes);
        System.out.println(isLegal);
    }
}
