import java.nio.charset.*;

public class CoderResult_3 {
    public static void main(String[] args) {
        CharsetEncoder encoder = Charset.forName("UTF-8").newEncoder();
        CoderResult result = encoder.encode(CharBuffer.wrap("Hello"));
        System.out.println(result.isUnmappable());
    }
}
