import java.nio.ByteBuffer;

public class Buffer_7 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Write some data into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Print the buffer's content
        System.out.println("Before rewind: " + buffer);

        // Rewind the buffer
        buffer.rewind();

        // Print the buffer's content after rewind
        System.out.println("After rewind: " + buffer);
    }
}
