import java.io.IOException;
import java.io.PushbackReader;
import java.io.StringReader;

public class PushbackReader_11 {
    public static void main(String[] args) {
        try (PushbackReader reader = new PushbackReader(new StringReader("Hello, World!"))) {
            int c = reader.read();
            if (reader.ready()) {
                System.out.println("The stream is ready to be read.");
            } else {
                System.out.println("The stream is not ready to be read.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
