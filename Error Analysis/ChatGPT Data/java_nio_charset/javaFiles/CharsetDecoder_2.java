import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class CharsetDecoder_2 {
    public static void main(String[] args) {
        CharsetDecoder decoder = CharsetDecoder
                .newDecoder()
                .onMalformedInput(CodingErrorAction.REPLACE)
                .onUnmappableCharacter(CodingErrorAction.REPLACE);
        
        System.out.println("CharsetDecoder configured with Malformed Input Action: " + decoder.malformedInputAction());
    }
}
