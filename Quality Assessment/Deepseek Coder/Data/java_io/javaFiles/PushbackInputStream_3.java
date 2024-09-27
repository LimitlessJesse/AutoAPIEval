import java.io.PushbackInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class PushbackInputStream_3 {
    public static void main(String[] args) {
        byte[] data = {1, 2, 3, 4, 5};
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        PushbackInputStream pushbackStream = new PushbackInputStream(in);

        byte[] buffer = new byte[2];
        try {
            // Read first two bytes
            int numRead = pushbackStream.read(buffer, 0, buffer.length);
            if (numRead == buffer.length) {
                System.out.println("Read: " + new String(buffer));
            }

            // Push back the first byte
            pushbackStream.unread(buffer, 0, 1);

            // Read the next byte
            int nextByte = pushbackStream.read();
            System.out.println("Next byte: " + (char) nextByte);

            // Read the remaining bytes
            int remainingBytes = pushbackStream.read(buffer, 0, buffer.length);
            if (remainingBytes == buffer.length) {
                System.out.println("Remaining: " + new String(buffer));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
