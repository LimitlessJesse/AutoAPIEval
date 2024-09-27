import java.nio.ByteBuffer;

public class ByteBuffer_1 {
    public static void main(String[] args) {
        // Allocate a new byte buffer with a capacity of 10 bytes
        ByteBuffer buffer = ByteBuffer.allocate(10);

        // Print the capacity of the buffer
        System.out.println("Capacity: " + buffer.capacity());

        // Print the remaining elements in the buffer
        System.out.println("Remaining: " + buffer.remaining());

        // Print the position of the buffer
        System.out.println("Position: " + buffer.position());

        // Print the limit of the buffer
        System.out.println("Limit: " + buffer.limit());
    }
}
