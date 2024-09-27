import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class CharsetDecoder_4 {
    public static void main(String[] args) {
        CharsetDecoder decoder = CharsetDecoder.forName("UTF-8").newDecoder();
        CodingErrorAction action = CodingErrorAction.REPORT;
        
        decoder.onUnmappableCharacter(action);
    }
}
