import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_5 {
    public static void main(String[] args) throws IOException {
        PushbackInputStream pis = new PushbackInputStream(System.in);
        int b = pis.read();
        if (b!= -1) {
            System.out.println("Read byte: " + b);
            System.out.println("Available bytes: " + pis.available());
            pis.unread(b);
            System.out.println("Available bytes after unread: " + pis.available());
        }
    }
}
