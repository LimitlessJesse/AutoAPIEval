import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReader_7 {
    public static void main(String[] args) {
        StringReader stringReader = new StringReader("Hello World");
        PushbackReader pushbackReader = new PushbackReader(stringReader);

        try {
            char[] buffer = new char[10];
            int read = pushbackReader.read(buffer);

            // Push back the first character
            pushbackReader.unread(buffer, 0, 1);

            // Read again
            read = pushbackReader.read(buffer);

            System.out.println(new String(buffer, 0, read));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
