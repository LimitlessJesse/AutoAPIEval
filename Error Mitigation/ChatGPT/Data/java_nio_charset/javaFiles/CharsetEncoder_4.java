import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class CharsetEncoder_4 {
    public static void main(String[] args) {
        CharsetEncoder encoder = CharsetEncoder.forName("UTF-8").newEncoder();
        CodingErrorAction action = encoder.malformedInputAction();
        System.out.println("Malformed Input Action: " + action);
    }
}
