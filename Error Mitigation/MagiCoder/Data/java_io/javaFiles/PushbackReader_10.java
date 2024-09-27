import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReader_10 {
    public static void main(String[] args) {
        try {
            StringReader stringReader = new StringReader("Hello, World!");
            PushbackReader pushbackReader = new PushbackReader(stringReader);

            // Read a character
            int c = pushbackReader.read();
            System.out.println((char) c);

            // Push back the character
            pushbackReader.unread(c);

            // Try to reset the stream
            pushbackReader.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
