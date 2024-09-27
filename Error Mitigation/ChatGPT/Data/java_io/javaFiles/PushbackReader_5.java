import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_5 {
    public static void main(String[] args) {
        String text = "Hello World";
        StringReader stringReader = new StringReader(text);
        PushbackReader pushbackReader = new PushbackReader(stringReader);

        try {
            boolean isReady = pushbackReader.ready();
            System.out.println("Is ready to read: " + isReady);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
