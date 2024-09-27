import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class CharsetDecoder_3 {
    public static void main(String[] args) {
        CharsetDecoder decoder = CharsetDecoder
                                    .forName("UTF-8")
                                    .onMalformedInput(CodingErrorAction.IGNORE);
        System.out.println("CharsetDecoder configured with IGNORE for malformed input");
    }
}
