import java.nio.LongBuffer;

public class LongBuffer_2 {
    public static void main(String[] args) {
        // Create a new long buffer
        LongBuffer buffer = LongBuffer.allocate(10);

        // Fill the buffer with some data
        for (int i = 0; i < buffer.capacity(); i++) {
            buffer.put(i);
        }

        // Duplicate the buffer
        LongBuffer duplicateBuffer = buffer.duplicate();

        // Print the content of the original buffer
        System.out.println("Original buffer:");
        buffer.position(0);
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();

        // Print the content of the duplicate buffer
        System.out.println("Duplicate buffer:");
        duplicateBuffer.position(0);
        while (duplicateBuffer.hasRemaining()) {
            System.out.print(duplicateBuffer.get() + " ");
        }
        System.out.println();
    }
}
