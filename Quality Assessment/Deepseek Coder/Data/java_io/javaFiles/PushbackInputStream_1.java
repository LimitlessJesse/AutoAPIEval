import java.io.PushbackInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PushbackInputStream_1 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        PushbackInputStream pushbackInputStream = new PushbackInputStream(byteArrayInputStream);

        try {
            int value = pushbackInputStream.read();
            System.out.println("Read value: " + value);

            // Push back the read value
            pushbackInputStream.unread(value);

            // Read the pushed back value
            int pushedBackValue = pushbackInputStream.read();
            System.out.println("Pushed back value: " + pushedBackValue);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
