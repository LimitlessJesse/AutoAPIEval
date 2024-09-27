import java.io.PushbackInputStream;
import java.io.IOException;

public class PushbackInputStream_3 {
    public static void main(String[] args) {
        try {
            PushbackInputStream pushbackInputStream = new PushbackInputStream(System.in);
            int b = pushbackInputStream.read();
            pushbackInputStream.unread(b);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
