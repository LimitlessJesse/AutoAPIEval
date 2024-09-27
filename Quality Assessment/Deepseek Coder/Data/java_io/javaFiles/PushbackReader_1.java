import java.io.PushbackReader;
import java.io.StringReader;
import java.io.IOException;

public class PushbackReader_1 {
    public static void main(String[] args) {
        String str = "Hello, World!";
        PushbackReader reader = new PushbackReader(new StringReader(str));

        try {
            int c;
            while ((c = reader.read())!= -1) {
                if (c == 'H') {
                    reader.unread('h'); // Pushback 'h' instead of 'H'
                    c = reader.read();  // Read the next character
                    System.out.print((char) c);
                } else {
                    System.out.print((char) c);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
