import java.nio.charset.CharsetEncoder;
import java.nio.charset.Charset;

public class CharsetEncoder_1 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();
        
        char c = 'A';
        boolean canEncode = encoder.canEncode(c);
        
        System.out.println("Can encode character '" + c + "': " + canEncode);
    }
}
