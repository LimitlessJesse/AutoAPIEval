import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReader_5 {
    public static void main(String[] args) {
        try (PushbackReader reader = new PushbackReader(new StringReader("Hello, World!"))) {
            char[] buffer = new char[5];
            int read = reader.read(buffer, 0, buffer.length);
            if (read!= -1) {
                System.out.println(new String(buffer, 0, read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
