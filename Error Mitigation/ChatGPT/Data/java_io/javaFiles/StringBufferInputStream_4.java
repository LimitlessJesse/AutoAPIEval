import java.io.StringBufferInputStream;

public class StringBufferInputStream_4 {
    public static void main(String[] args) {
        StringBufferInputStream stream = new StringBufferInputStream("Hello World");
        long bytesSkipped = stream.skip(5);
        System.out.println("Bytes skipped: " + bytesSkipped);
    }
}
