import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

public class CharsetEncoder_5 {
    public static void main(String[] args) {
        CharsetEncoder encoder = CharsetEncoder.forName("UTF-8").newEncoder();
        CodingErrorAction action = encoder.unmappableCharacterAction();
        System.out.println("Current unmappable character action: " + action);
    }
}
