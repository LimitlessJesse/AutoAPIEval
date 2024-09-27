import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStream_4 {
    public static void main(String[] args) {
        byte[] byteArray = {65, 66, 67, 68, 69}; // ASCII values for A, B, C, D, E
        ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        PushbackInputStream pbis = new PushbackInputStream(bais);

        byte[] buffer = new byte[3];
        try {
            pbis.read(buffer, 0, 3); // Reading 3 bytes from the input stream
            System.out.println("Bytes read: " + new String(buffer));

            pbis.unread(buffer, 0, 3); // Pushing back the 3 bytes read
            buffer = new byte[5];
            pbis.read(buffer, 0, 5); // Reading 5 bytes from the input stream
            System.out.println("Bytes read after pushback: " + new String(buffer));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
