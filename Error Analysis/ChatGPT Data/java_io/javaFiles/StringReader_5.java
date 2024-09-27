import java.io.StringReader;

public class StringReader_5 {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, World!");
        System.out.println("markSupported(): " + reader.markSupported());
    }
}
