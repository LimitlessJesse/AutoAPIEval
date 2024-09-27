import java.nio.Buffer;
import java.nio.ByteBuffer;

public class Buffer_3 {
    public static void main(String[] args) {
        // Create a ByteBuffer with some data
        ByteBuffer buffer = ByteBuffer.allocate(10);
        for (int i = 0; i < 10; i++) {
            buffer.put((byte) i);
        }

        // Print the buffer's data
        System.out.println("Before clear:");
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();

        // Clear the buffer
        buffer.clear();

        // Print the buffer's data after clear
        System.out.println("After clear:");
        buffer.flip();
        while (buffer.hasRemaining()) {
            System.out.print(buffer.get() + " ");
        }
        System.out.println();
    }
}
