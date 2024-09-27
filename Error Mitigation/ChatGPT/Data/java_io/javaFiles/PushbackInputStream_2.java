import java.io.PushbackInputStream;
import java.io.IOException;

public class PushbackInputStream_2 {
    public static void main(String[] args) {
        byte[] buffer = new byte[10];
        PushbackInputStream pushbackInputStream = new PushbackInputStream(System.in);

        try {
            int bytesRead = pushbackInputStream.read(buffer, 0, buffer.length);
            System.out.println("Total bytes read: " + bytesRead);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
