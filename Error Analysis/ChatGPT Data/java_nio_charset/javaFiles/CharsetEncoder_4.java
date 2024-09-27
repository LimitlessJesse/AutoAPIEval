import java.nio.charset.CharsetEncoder;

public class CharsetEncoder_4 {
    public static void main(String[] args) {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        byte[] replacement = {63}; // Example byte array
        boolean isLegal = encoder.isLegalReplacement(replacement);
        System.out.println("Is legal replacement: " + isLegal);
    }
}
