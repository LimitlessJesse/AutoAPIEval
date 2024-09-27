import java.nio.IntBuffer;

public class IntBuffer_19 {
    public static void main(String[] args) {
        // Create a new IntBuffer
        IntBuffer buffer = IntBuffer.allocate(10);

        // Fill the buffer with some data
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        // Flip the buffer to prepare it for reading
        buffer.flip();

        // Create a read-only copy of the buffer
        IntBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();

        // Print the content of the read-only buffer
        while (readOnlyBuffer.hasRemaining()) {
            System.out.println(readOnlyBuffer.get());
        }
    }
}
