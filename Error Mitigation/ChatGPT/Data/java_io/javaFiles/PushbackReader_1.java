import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_1 {
    public static void main(String[] args) {
        String str = "Hello World!";
        StringReader reader = new StringReader(str);
        PushbackReader pushbackReader = new PushbackReader(reader);

        try {
            int ch;
            while ((ch = pushbackReader.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
