import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_2 {
    public static void main(String[] args) {
        try {
            StringReader reader = new StringReader("Hello, World!");
            PushbackReader pushbackReader = new PushbackReader(reader);
            char[] buffer = new char[5];
            int numCharsRead = pushbackReader.read(buffer, 0, 5);
            System.out.println("Number of characters read: " + numCharsRead);
            System.out.println("Characters read: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
