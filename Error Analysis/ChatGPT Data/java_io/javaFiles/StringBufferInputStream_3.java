import java.io.StringBufferInputStream;

public class StringBufferInputStream_3 {
    public static void main(String[] args) {
        StringBufferInputStream stream = new StringBufferInputStream("Hello World");
        long skipped = stream.skip(6);
        System.out.println("Skipped " + skipped + " bytes");
    }
}
