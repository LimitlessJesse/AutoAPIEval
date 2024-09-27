import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReader_12 {
    public static void main(String[] args) {
        try (PushbackReader reader = new PushbackReader(new StringReader("Hello, World!"))) {
            int c = reader.read();
            if (c == 'H') {
                reader.unread('h');
                c = reader.read();
            }
            System.out.println((char) c);
            reader.skip(1);
            c = reader.read();
            System.out.println((char) c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
