import java.nio.charset.*;

public class CoderResult_4 {
    public static void main(String[] args) {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        CharBuffer buffer = CharBuffer.wrap("Hello");
        CoderResult result = encoder.encode(buffer);

        if (result.isMalformed()) {
            System.out.println("The input is malformed.");
        } else {
            System.out.println("The input is well-formed.");
        }
    }
}
