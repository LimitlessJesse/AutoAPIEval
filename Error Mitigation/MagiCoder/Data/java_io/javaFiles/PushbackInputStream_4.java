import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_4 {
    public static void main(String[] args) {
        try {
            PushbackInputStream inputStream = new PushbackInputStream(System.in);
            int data = inputStream.read();
            if (data == 'a') {
                inputStream.unread('b');
            } else {
                inputStream.unread(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
