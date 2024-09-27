import java.nio.charset.*;

public class CoderResult_2 {
    public static void main(String[] args) {
        CharsetEncoder encoder = Charset.defaultCharset().newEncoder();
        CoderResult result = encoder.encode(CharBuffer.wrap("Hello"));
        boolean isOverflow = result.isOverflow();
        System.out.println("Is overflow: " + isOverflow);
    }
}
