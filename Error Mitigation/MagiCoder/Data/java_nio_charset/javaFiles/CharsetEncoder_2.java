import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_2 {
    public static void main(String[] args) {
        Charset charset = Charset.forName("UTF-8");
        CharsetEncoder encoder = charset.newEncoder();

        byte[] replacement = {(byte) 0xC3, (byte) 0x28}; // Example replacement
        boolean isLegal = encoder.isLegalReplacement(replacement);

        System.out.println("Is the replacement legal? " + isLegal);
    }
}
