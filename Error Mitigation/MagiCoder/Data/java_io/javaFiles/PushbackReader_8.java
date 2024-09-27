import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReader_8 {
    public static void main(String[] args) {
        try (PushbackReader reader = new PushbackReader(new StringReader("Hello, World!"))) {
            int c = reader.read();
            if (c == 'H') {
                reader.unread('h');
                c = reader.read();
            }
            System.out.println((char) c);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
