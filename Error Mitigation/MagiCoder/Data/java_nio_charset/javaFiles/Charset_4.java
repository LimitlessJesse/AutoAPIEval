import java.nio.charset.Charset;
import java.nio.ByteBuffer;

public class Charset_4 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Charset charset = Charset.forName("UTF-8");
        ByteBuffer byteBuffer = charset.encode(input);

        byte[] bytes = new byte[byteBuffer.remaining()];
        byteBuffer.get(bytes);

        System.out.println("Encoded bytes: " + new String(bytes));
    }
}
