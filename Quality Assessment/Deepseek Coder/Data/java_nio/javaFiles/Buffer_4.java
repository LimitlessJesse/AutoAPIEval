import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_4 {
    public static void main(String[] args) {
        // Create a ByteBuffer of 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Put some data into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Rewind the buffer
        buffer.rewind();

        // Print the buffer's content
        while(buffer.hasRemaining()){
            System.out.print(buffer.get() + " ");
        }
    }
}
