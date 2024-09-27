import java.nio.ByteBuffer;

public class ByteBuffer_3 {
    public static void main(String[] args) {
        // Create a new ByteBuffer with a capacity of 10
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Put a byte into the buffer
        buffer.put((byte) 123);

        // Flip the buffer to prepare for reading
        buffer.flip();

        // Read the byte from the buffer
        byte b = buffer.get();

        // Print the byte
        System.out.println(b);
    }
}
