import java.io.PushbackInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PushbackInputStream_5 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream);

        try {
            int b;
            while ((b = pushbackInputStream.read())!= -1) {
                if (b == 3) {
                    pushbackInputStream.unread(new byte[]{3});
                    b = pushbackInputStream.read();
                    System.out.println("Pushed back: " + b);
                } else {
                    System.out.println("Read: " + b);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
