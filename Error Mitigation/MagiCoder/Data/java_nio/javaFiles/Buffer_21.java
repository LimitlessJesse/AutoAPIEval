import java.nio.ByteBuffer;

public class Buffer_21 {
    public static void main(String[] args) {
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Put some data into the buffer
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put((byte) i);
        }

        // Mark the position
        buffer.mark();

        // Move the position
        buffer.position(5);

        // Reset the position to the mark
        buffer.reset();

        // Print the position
        System.out.println("Position after reset: " + buffer.position());
    }
}
